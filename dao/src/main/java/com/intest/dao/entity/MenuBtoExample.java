package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuBtoExample {
    /**
     * F_MENU
     */
    protected String orderByClause;

    /**
     * F_MENU
     */
    protected boolean distinct;

    /**
     * F_MENU
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public MenuBtoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * F_MENU null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdIsNull() {
            addCriterion("FK_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdIsNotNull() {
            addCriterion("FK_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdEqualTo(String value) {
            addCriterion("FK_MENU_ID =", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdNotEqualTo(String value) {
            addCriterion("FK_MENU_ID <>", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdGreaterThan(String value) {
            addCriterion("FK_MENU_ID >", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_MENU_ID >=", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdLessThan(String value) {
            addCriterion("FK_MENU_ID <", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdLessThanOrEqualTo(String value) {
            addCriterion("FK_MENU_ID <=", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdLike(String value) {
            addCriterion("FK_MENU_ID like", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdNotLike(String value) {
            addCriterion("FK_MENU_ID not like", value, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdIn(List<String> values) {
            addCriterion("FK_MENU_ID in", values, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdNotIn(List<String> values) {
            addCriterion("FK_MENU_ID not in", values, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdBetween(String value1, String value2) {
            addCriterion("FK_MENU_ID between", value1, value2, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andFkMenuIdNotBetween(String value1, String value2) {
            addCriterion("FK_MENU_ID not between", value1, value2, "fkMenuId");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameIsNull() {
            addCriterion("MENUDISPLAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameIsNotNull() {
            addCriterion("MENUDISPLAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameEqualTo(String value) {
            addCriterion("MENUDISPLAYNAME =", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameNotEqualTo(String value) {
            addCriterion("MENUDISPLAYNAME <>", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameGreaterThan(String value) {
            addCriterion("MENUDISPLAYNAME >", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUDISPLAYNAME >=", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameLessThan(String value) {
            addCriterion("MENUDISPLAYNAME <", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameLessThanOrEqualTo(String value) {
            addCriterion("MENUDISPLAYNAME <=", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameLike(String value) {
            addCriterion("MENUDISPLAYNAME like", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameNotLike(String value) {
            addCriterion("MENUDISPLAYNAME not like", value, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameIn(List<String> values) {
            addCriterion("MENUDISPLAYNAME in", values, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameNotIn(List<String> values) {
            addCriterion("MENUDISPLAYNAME not in", values, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameBetween(String value1, String value2) {
            addCriterion("MENUDISPLAYNAME between", value1, value2, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenudisplaynameNotBetween(String value1, String value2) {
            addCriterion("MENUDISPLAYNAME not between", value1, value2, "menudisplayname");
            return (Criteria) this;
        }

        public Criteria andMenulinkIsNull() {
            addCriterion("MENULINK is null");
            return (Criteria) this;
        }

        public Criteria andMenulinkIsNotNull() {
            addCriterion("MENULINK is not null");
            return (Criteria) this;
        }

        public Criteria andMenulinkEqualTo(String value) {
            addCriterion("MENULINK =", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkNotEqualTo(String value) {
            addCriterion("MENULINK <>", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkGreaterThan(String value) {
            addCriterion("MENULINK >", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkGreaterThanOrEqualTo(String value) {
            addCriterion("MENULINK >=", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkLessThan(String value) {
            addCriterion("MENULINK <", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkLessThanOrEqualTo(String value) {
            addCriterion("MENULINK <=", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkLike(String value) {
            addCriterion("MENULINK like", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkNotLike(String value) {
            addCriterion("MENULINK not like", value, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkIn(List<String> values) {
            addCriterion("MENULINK in", values, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkNotIn(List<String> values) {
            addCriterion("MENULINK not in", values, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkBetween(String value1, String value2) {
            addCriterion("MENULINK between", value1, value2, "menulink");
            return (Criteria) this;
        }

        public Criteria andMenulinkNotBetween(String value1, String value2) {
            addCriterion("MENULINK not between", value1, value2, "menulink");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("ISSHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("ISSHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Short value) {
            addCriterion("ISSHOW =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Short value) {
            addCriterion("ISSHOW <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Short value) {
            addCriterion("ISSHOW >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Short value) {
            addCriterion("ISSHOW >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Short value) {
            addCriterion("ISSHOW <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Short value) {
            addCriterion("ISSHOW <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Short> values) {
            addCriterion("ISSHOW in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Short> values) {
            addCriterion("ISSHOW not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Short value1, Short value2) {
            addCriterion("ISSHOW between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Short value1, Short value2) {
            addCriterion("ISSHOW not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIspageIsNull() {
            addCriterion("ISPAGE is null");
            return (Criteria) this;
        }

        public Criteria andIspageIsNotNull() {
            addCriterion("ISPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIspageEqualTo(Short value) {
            addCriterion("ISPAGE =", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageNotEqualTo(Short value) {
            addCriterion("ISPAGE <>", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageGreaterThan(Short value) {
            addCriterion("ISPAGE >", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageGreaterThanOrEqualTo(Short value) {
            addCriterion("ISPAGE >=", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageLessThan(Short value) {
            addCriterion("ISPAGE <", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageLessThanOrEqualTo(Short value) {
            addCriterion("ISPAGE <=", value, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageIn(List<Short> values) {
            addCriterion("ISPAGE in", values, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageNotIn(List<Short> values) {
            addCriterion("ISPAGE not in", values, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageBetween(Short value1, Short value2) {
            addCriterion("ISPAGE between", value1, value2, "ispage");
            return (Criteria) this;
        }

        public Criteria andIspageNotBetween(Short value1, Short value2) {
            addCriterion("ISPAGE not between", value1, value2, "ispage");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(Short value) {
            addCriterion("ORDERNO =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(Short value) {
            addCriterion("ORDERNO <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(Short value) {
            addCriterion("ORDERNO >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDERNO >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(Short value) {
            addCriterion("ORDERNO <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(Short value) {
            addCriterion("ORDERNO <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<Short> values) {
            addCriterion("ORDERNO in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<Short> values) {
            addCriterion("ORDERNO not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(Short value1, Short value2) {
            addCriterion("ORDERNO between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(Short value1, Short value2) {
            addCriterion("ORDERNO not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("ISDELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("ISDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Short value) {
            addCriterion("ISDELETE =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Short value) {
            addCriterion("ISDELETE <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Short value) {
            addCriterion("ISDELETE >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDELETE >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Short value) {
            addCriterion("ISDELETE <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Short value) {
            addCriterion("ISDELETE <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Short> values) {
            addCriterion("ISDELETE in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Short> values) {
            addCriterion("ISDELETE not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Short value1, Short value2) {
            addCriterion("ISDELETE between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Short value1, Short value2) {
            addCriterion("ISDELETE not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("CREATEAT is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("CREATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("CREATEAT =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("CREATEAT <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("CREATEAT >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEAT >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("CREATEAT <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("CREATEAT <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("CREATEAT in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("CREATEAT not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("CREATEAT between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("CREATEAT not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CREATEBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CREATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CREATEBY =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CREATEBY <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CREATEBY >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEBY >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CREATEBY <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CREATEBY <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CREATEBY like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CREATEBY not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CREATEBY in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CREATEBY not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CREATEBY between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CREATEBY not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("UPDATEAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("UPDATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(Date value) {
            addCriterion("UPDATEAT =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(Date value) {
            addCriterion("UPDATEAT <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(Date value) {
            addCriterion("UPDATEAT >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(Date value) {
            addCriterion("UPDATEAT <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<Date> values) {
            addCriterion("UPDATEAT in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<Date> values) {
            addCriterion("UPDATEAT not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UPDATEBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UPDATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UPDATEBY =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UPDATEBY <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UPDATEBY >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEBY >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UPDATEBY <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UPDATEBY <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UPDATEBY like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UPDATEBY not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UPDATEBY in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UPDATEBY not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UPDATEBY between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UPDATEBY not between", value1, value2, "updateby");
            return (Criteria) this;
        }
    }

    /**
     * F_MENU
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_MENU null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}