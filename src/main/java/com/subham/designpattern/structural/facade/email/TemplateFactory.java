package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class TemplateFactory {
    public static Template createTemplateFor(Template.TemplateType type) {
        switch (type) {
            case Email:
                return new OrderEmailTemplate();
            default:
                throw new IllegalArgumentException("Unknown TemplateType");
        }
    }
}
