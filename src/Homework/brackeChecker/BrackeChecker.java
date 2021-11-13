package Homework.brackeChecker;

import lesson10.Stack;

public class BrackeChecker {
    //    սա հենց տեքստն է
    private String text;

    //    կլասսի կոնստրուկտորն է,որ պետք է ընդունի String տիպի տեքստ և վերագրի վերևի տեքստին
    //    Որ չկարողանանք BraceChecker-ի օբյեկտը սարկենք առանց text-տալու կանստրուկտորի միջոցով
    public BrackeChecker(String text) {
        this.text = text;

    }

    //    սա հիմնական մեթոդն է ,որի մեջ գռելու ենք ամբողջ լոգիկան ․աշխատոլու ենք թե stack-ի հետ, թե վերևի text-ի հետ
    public void check() {
        Stack stack = new Stack();
        int pop;
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error Closed " + c + " but nothing opened at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but opened " + (char) pop + "at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error Closed " + c + " but nothing opened at " + i);
                    } else if (pop != '{') {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but opened " + (char) pop + "at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error Closed " + c + " but nothing opened at " + i);
                    } else if (pop != '[') {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but opened " + (char) pop + "at " + i);
                    }
                    break;
            }
        }
//        int last;
//        while ((last = stack.pop()) != 0) {
//            isValid = false;
//            System.err.println("Error: opened " + (char) last + "but nothing closed");
//        }
        while (!stack.isEmpty()) {
            isValid = false;
            System.err.println("Error:opened " + (char) stack.pop() + " but nothing closed");
        }
        if (isValid) {
            System.out.println("Everything is good");
        }

    }
}



