package template.simple_template.concrete_object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template.simple_template.template.CaffieneBeverageWithHook;

public class TeaWithHook extends CaffieneBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public boolean customerWantsCondiments() {
        String ans = getUserInput();
        if (ans.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String ans = null;
        System.out.println("would you like lemon with your tea (y/n) ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = in.readLine();
        } catch (IOException e) {
            System.out.println("IO error while reading answer");
        }

        if (ans == null) return "no";
        return ans;
    }
}
