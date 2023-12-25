package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public abstract class Template {
    public enum TemplateType {Email, NewsLetter};

    public abstract String format(Object obj);
}
