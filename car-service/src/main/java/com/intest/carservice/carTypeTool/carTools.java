package com.intest.carservice.carTypeTool;

public class carTools {

    public static String replaceCharacter(String OldChar) {
        String NewChar = "";
        String charter = OldChar.split(" ")[0];

        switch (charter) {
            case "carTypeId":
                NewChar = OldChar.replace(charter, "Cartype_Id");
                break;
        }
        return NewChar;
    }
}
