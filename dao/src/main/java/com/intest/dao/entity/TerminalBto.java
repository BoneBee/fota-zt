package com.intest.dao.entity;

public class TerminalBto {
    /**
     * Terminal_ID TERMINAL_ID
     */
    private String terminalId;

    /**
     * TerminalName TERMINALNAME
     */
    private String terminalname;

    /**
     * PCOMPANY PCOMPANY
     */
    private String pcompany;

    /**
     * Terminal_ID
     * @author intest
     * @date 2020-09-23 09:21:53
     * @return TERMINAL_ID Terminal_ID
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Terminal_ID
     * @author intest
     * @date 2020-09-23 09:21:53
     * @param terminalId Terminal_ID
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    /**
     * TerminalName
     * @author intest
     * @date 2020-09-23 09:21:53
     * @return TERMINALNAME TerminalName
     */
    public String getTerminalname() {
        return terminalname;
    }

    /**
     * TerminalName
     * @author intest
     * @date 2020-09-23 09:21:53
     * @param terminalname TerminalName
     */
    public void setTerminalname(String terminalname) {
        this.terminalname = terminalname == null ? null : terminalname.trim();
    }

    /**
     * PCOMPANY
     * @author intest
     * @date 2020-09-23 09:21:53
     * @return PCOMPANY PCOMPANY
     */
    public String getPcompany() {
        return pcompany;
    }

    /**
     * PCOMPANY
     * @author intest
     * @date 2020-09-23 09:21:53
     * @param pcompany PCOMPANY
     */
    public void setPcompany(String pcompany) {
        this.pcompany = pcompany == null ? null : pcompany.trim();
    }
}