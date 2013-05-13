package main.java;

import org.intellij.lang.annotations.Language;

import java.util.ArrayList;

public class Candidate {

    public Candidate() {}

    public Long id() {
        return 1L;
    }

    public String name() {
        return "foo";
    }

    public String email() {
        return "foo@bar.com";
    }

    public Long currentJobId() {
        return 1L;
    }

    public ArrayList<Long> applying() {
        return new ArrayList<Long>();
    }

    public ArrayList<String> query(ArrayList<Candidate> cs) {
        ArrayList<String> resCands = new ArrayList<String>()
        for (Candidate c : cs) {
            for (Job j : c.appliesTo) {
                if (c.company() == "Microsoft" &&
                    j.company() == "Oracle") {
                    resCands.add(c.name() + " " + c.phone())
                }
            }
        }
        return resCands;
    }
}
