/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

import Models.ClassTable;
import Models.Error;
import Models.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author Amin
 */
public class Program {

    private static HashMap<String, List<Error>> errorMap= new HashMap<>();
    private static Node root = Node.getRoot();

    public static void main(String[] args) throws IOException, NullPointerException {
        File inputDir = new File("input");
        if (inputDir.listFiles() != null) {
            for (File file : inputDir.listFiles()) {
                if (file.isDirectory())
                    continue;
                CharStream stream = CharStreams.fromFileName(file.getPath());
                JythonLexer lexer = new JythonLexer(stream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JythonParser parser = new JythonParser(tokens);
                ParseTree tree = parser.program();
                ParseTreeWalker walker = new ParseTreeWalker();
                PhaseOneListener listener = new PhaseOneListener(file.getName(), root);
                walker.walk(listener, tree);
            }
            phaseOneErrorCheck();
            for (File file : inputDir.listFiles()) {
                if (file.isDirectory())
                    continue;
                CharStream stream = CharStreams.fromFileName(file.getPath());
                JythonLexer lexer = new JythonLexer(stream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JythonParser parser = new JythonParser(tokens);
                ParseTree tree = parser.program();
                ParseTreeWalker walker = new ParseTreeWalker();
                PhaseTwoListener listener = new PhaseTwoListener(file.getName(), root);
                walker.walk(listener, tree);
                phaseTwoErrorCheck(listener.getErrors());
            }
            printErrors();
        }
    }

    private static void phaseOneErrorCheck(){
        List<Error> errors = Node.getClassTable().errorCheck();
        errors.addAll(root.errorCheck());

        for(Error error : errors) {
            if (!errorMap.containsKey(error.fileName))
                errorMap.put(error.fileName, new ArrayList<>());

            errorMap.get(error.fileName).add(error);
        }
    }

    private static void phaseTwoErrorCheck(List<Error> errors){
        for(Error error : errors) {
            if (!errorMap.containsKey(error.fileName))
                errorMap.put(error.fileName, new ArrayList<>());

            errorMap.get(error.fileName).add(error);
        }
    }

    private static void printErrors(){
        for(Map.Entry<String, List<Error>> pair : errorMap.entrySet()){
            System.out.println("In File " + pair.getKey() + ":");
            pair.getValue().sort(Comparator.comparingInt(e -> e.line));
            for(Error error : pair.getValue())
                System.out.println(error.message);
        }
    }
}
