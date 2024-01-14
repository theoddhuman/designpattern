package com.subham.designpattern.behavioral.visitor;

/**
 * @author subham.paul
 */
public class Programmer extends AbstractEmployee {
    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
