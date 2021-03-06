package com.sivalabs.springstarter.extensions.docker;

import io.spring.initializr.generator.io.template.MustacheTemplateRenderer;
import io.spring.initializr.generator.io.text.MustacheSection;

import java.util.Map;

public class Dockerfile extends MustacheSection {

    public Dockerfile(MustacheTemplateRenderer templateRenderer, String templateName,
                      Map<String, Object> model) {
        super(templateRenderer, templateName, model);
    }
}
