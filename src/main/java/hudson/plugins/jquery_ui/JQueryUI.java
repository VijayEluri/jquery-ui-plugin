package hudson.plugins.jquery_ui;

import hudson.Extension;
import hudson.model.PageDecorator;

@Extension(ordinal=5)
public class JQueryUI extends PageDecorator {

    public JQueryUI() {
        super(JQueryUI.class);
    }
}
