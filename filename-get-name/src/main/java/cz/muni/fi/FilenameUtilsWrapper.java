package cz.muni.fi;

import org.apache.commons.io.FilenameUtils;

public class FilenameUtilsWrapper {

    public static String getName(String filename) {
        return FilenameUtils.getName(filename);
    }
}