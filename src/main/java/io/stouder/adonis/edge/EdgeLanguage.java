package io.stouder.adonis.edge;

import com.intellij.lang.Language;
import io.stouder.adonis.AdonisBundle;

public class EdgeLanguage extends Language {
    public static final EdgeLanguage INSTANCE = new EdgeLanguage();

    private EdgeLanguage() {
        super(AdonisBundle.message("adonis.edge.identifier"));
    }
}
