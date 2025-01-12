package template.simple_template.concrete_object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template.simple_template.template.CaffieneBeverageWithHook;

public class CoffeWithHook extends CaffieneBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("dipping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
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
        System.out.println("would you like milk and sugar with your coffee (y/n) ? ");
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
