package com.intest.basicservice.table.impl.util;

public class CheckPwd {

    /**
     * @brief   检测密码中字符长度
     * @param[in] password            密码字符串
     * @return  符合长度要求 返回true
     */
    public static boolean checkPasswordLength(String password) {
        boolean flag =false;

        if("".equals(Config.MAX_LENGTH)) {
            if (password.length() >= Integer.parseInt(Config.MIN_LENGTH)) {
                flag = true;
            }
        }else{
            if (password.length() >= Integer.parseInt(Config.MIN_LENGTH) &&
                    password.length() <= Integer.parseInt(Config.MAX_LENGTH)) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * @return 包含数字 返回true
     * @brief 检测密码中是否包含数字
     * @param[in] password            密码字符串
     */
    public static boolean checkContainDigit(String password) {
        char[] chPass = password.toCharArray();
        boolean flag = false;
        int num_count = 0;

        for (int i = 0; i < chPass.length; i++) {
            if (Character.isDigit(chPass[i])) {
                num_count++;
            }
        }

        if (num_count >= 1) {
            flag = true;
        }
        return flag;
    }

    /**
     * @return 包含字母 返回true
     * @brief 检测密码中是否包含字母（不区分大小写）
     * @param[in] password            密码字符串
     */
    public static boolean checkContainCase(String password) {
        char[] chPass = password.toCharArray();
        boolean flag = false;
        int char_count = 0;

        for (int i = 0; i < chPass.length; i++) {
            if (Character.isLetter(chPass[i])) {
                char_count++;
            }
        }

        if (char_count >= 1) {
            flag = true;
        }
        return flag;
    }


    /**
     * @return 包含特殊符号 返回true
     * @brief 检测密码中是否包含特殊符号
     * @param[in] password            密码字符串
     */
    public static boolean checkContainSpecialChar(String password) {
        char[] chPass = password.toCharArray();
        boolean flag = false;
        int special_count = 0;

        for (int i = 0; i < chPass.length; i++) {
            if (Config.SPECIAL_CHAR.indexOf(chPass[i]) != -1) {
                special_count++;
            }
        }

        if (special_count >= 1) {
            flag = true;
        }
        return flag;
    }


    /**
     * @return 含有a-z,z-a连续字符串 返回true
     * @brief 评估a-z,z-a这样的连续字符
     * @param[in] password            密码字符串
     */
    public static boolean checkSequentialChars(String password) {
        String t_password = new String(password);
        boolean flag = false;
        int limit_num = Integer.parseInt(Config.LIMIT_LOGIC_NUM_CHAR);
        int normal_count = 0;
        int reversed_count = 0;

        //检测包含字母(区分大小写)
        if ("enable".equals(Config.CHECK_DISTINGGUISH_CASE)) {

        } else {
            t_password = t_password.toLowerCase();
        }
        int n = t_password.length();
        char[] pwdCharArr = t_password.toCharArray();

        for (int i = 0; i + limit_num <= n; i++) {
            normal_count = 0;
            reversed_count = 0;
            for (int j = 0; j < limit_num - 1; j++) {
                if (pwdCharArr[i + j + 1] - pwdCharArr[i + j] == 1) {
                    normal_count++;
                    if (normal_count == limit_num - 1) {
                        return true;
                    }
                }

                if (pwdCharArr[i + j] - pwdCharArr[i + j + 1] == 1) {
                    reversed_count++;
                    if (reversed_count == limit_num - 1) {
                        return true;
                    }
                }
            }
        }
        return flag;
    }


    /**
     * @return 含有aaaa, 1111等连续字符串 返回true
     * @brief 评估aaaa, 1111这样的相同连续字符
     * @param[in] password            密码字符串
     */
    public static boolean checkSequentialSameChars(String password) {
        String t_password = new String(password);
        int n = t_password.length();
        char[] pwdCharArr = t_password.toCharArray();
        boolean flag = false;
        int limit_num = Integer.parseInt(Config.LIMIT_NUM_SAME_CHAR);
        int count = 0;
        for (int i = 0; i + limit_num <= n; i++) {
            count = 0;
            for (int j = 0; j < limit_num - 1; j++) {
                if (pwdCharArr[i + j] == pwdCharArr[i + j + 1]) {
                    count++;
                    if (count == limit_num - 1) {
                        return true;
                    }
                }
            }
        }
        return flag;
    }



    /**
     * @brief   键盘规则匹配器 横向连续检测
     * @param[in] password            密码字符串
     * @return  含有横向连续字符串 返回true
     */
    public static boolean checkLateralKeyboardSite(String password) {
        String t_password = new String(password);
        //将所有输入字符转为小写
        t_password = t_password.toLowerCase();
        int n = t_password.length();
        /**
         * 键盘横向规则检测
         */
        boolean flag = false;
        int arrLen = Config.KEYBOARD_HORIZONTAL_ARR.length;
        int limit_num = Integer.parseInt(Config.LIMIT_HORIZONTAL_NUM_KEY) ;

        for(int i=0; i+limit_num<=n; i++) {
            String str = t_password.substring(i, i+limit_num);
            String distinguishStr = password.substring(i, i+limit_num);

            for(int j=0; j<arrLen; j++) {
                String configStr = Config.KEYBOARD_HORIZONTAL_ARR[j];
                String revOrderStr = new StringBuffer(Config.KEYBOARD_HORIZONTAL_ARR[j]).reverse().toString();

                //检测包含字母(区分大小写)
                if ("enable".equals(Config.CHECK_DISTINGGUISH_CASE)) {
                    //考虑 大写键盘匹配的情况
                    String UpperStr = Config.KEYBOARD_HORIZONTAL_ARR[j].toUpperCase();
                    if((configStr.indexOf(distinguishStr) != -1) || (UpperStr.indexOf(distinguishStr) != -1)) {
                        flag = true;
                        return flag;
                    }
                    //考虑逆序输入情况下 连续输入
                    String revUpperStr = new StringBuffer(UpperStr).reverse().toString();
                    if((revOrderStr.indexOf(distinguishStr) != -1) || (revUpperStr.indexOf(distinguishStr) != -1)) {
                        flag = true;
                        return flag;
                    }
                }else {
                    if(configStr.indexOf(str) != -1) {
                        flag = true;
                        return flag;
                    }
                    //考虑逆序输入情况下 连续输入
                    if(revOrderStr.indexOf(str) != -1) {
                        flag = true;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }

}
