package com.abin.lee.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNull() {
            addCriterion("education_degree is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNotNull() {
            addCriterion("education_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeEqualTo(String value) {
            addCriterion("education_degree =", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotEqualTo(String value) {
            addCriterion("education_degree <>", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThan(String value) {
            addCriterion("education_degree >", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("education_degree >=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThan(String value) {
            addCriterion("education_degree <", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThanOrEqualTo(String value) {
            addCriterion("education_degree <=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLike(String value) {
            addCriterion("education_degree like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotLike(String value) {
            addCriterion("education_degree not like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIn(List<String> values) {
            addCriterion("education_degree in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotIn(List<String> values) {
            addCriterion("education_degree not in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeBetween(String value1, String value2) {
            addCriterion("education_degree between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotBetween(String value1, String value2) {
            addCriterion("education_degree not between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathIsNull() {
            addCriterion("education_photo_path is null");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathIsNotNull() {
            addCriterion("education_photo_path is not null");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathEqualTo(String value) {
            addCriterion("education_photo_path =", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathNotEqualTo(String value) {
            addCriterion("education_photo_path <>", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathGreaterThan(String value) {
            addCriterion("education_photo_path >", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathGreaterThanOrEqualTo(String value) {
            addCriterion("education_photo_path >=", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathLessThan(String value) {
            addCriterion("education_photo_path <", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathLessThanOrEqualTo(String value) {
            addCriterion("education_photo_path <=", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathLike(String value) {
            addCriterion("education_photo_path like", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathNotLike(String value) {
            addCriterion("education_photo_path not like", value, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathIn(List<String> values) {
            addCriterion("education_photo_path in", values, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathNotIn(List<String> values) {
            addCriterion("education_photo_path not in", values, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathBetween(String value1, String value2) {
            addCriterion("education_photo_path between", value1, value2, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationPhotoPathNotBetween(String value1, String value2) {
            addCriterion("education_photo_path not between", value1, value2, "educationPhotoPath");
            return (Criteria) this;
        }

        public Criteria andEducationTypeIsNull() {
            addCriterion("education_type is null");
            return (Criteria) this;
        }

        public Criteria andEducationTypeIsNotNull() {
            addCriterion("education_type is not null");
            return (Criteria) this;
        }

        public Criteria andEducationTypeEqualTo(String value) {
            addCriterion("education_type =", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeNotEqualTo(String value) {
            addCriterion("education_type <>", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeGreaterThan(String value) {
            addCriterion("education_type >", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("education_type >=", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeLessThan(String value) {
            addCriterion("education_type <", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeLessThanOrEqualTo(String value) {
            addCriterion("education_type <=", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeLike(String value) {
            addCriterion("education_type like", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeNotLike(String value) {
            addCriterion("education_type not like", value, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeIn(List<String> values) {
            addCriterion("education_type in", values, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeNotIn(List<String> values) {
            addCriterion("education_type not in", values, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeBetween(String value1, String value2) {
            addCriterion("education_type between", value1, value2, "educationType");
            return (Criteria) this;
        }

        public Criteria andEducationTypeNotBetween(String value1, String value2) {
            addCriterion("education_type not between", value1, value2, "educationType");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusIsNull() {
            addCriterion("edu_sync_status is null");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusIsNotNull() {
            addCriterion("edu_sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusEqualTo(String value) {
            addCriterion("edu_sync_status =", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusNotEqualTo(String value) {
            addCriterion("edu_sync_status <>", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusGreaterThan(String value) {
            addCriterion("edu_sync_status >", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusGreaterThanOrEqualTo(String value) {
            addCriterion("edu_sync_status >=", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusLessThan(String value) {
            addCriterion("edu_sync_status <", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusLessThanOrEqualTo(String value) {
            addCriterion("edu_sync_status <=", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusLike(String value) {
            addCriterion("edu_sync_status like", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusNotLike(String value) {
            addCriterion("edu_sync_status not like", value, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusIn(List<String> values) {
            addCriterion("edu_sync_status in", values, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusNotIn(List<String> values) {
            addCriterion("edu_sync_status not in", values, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusBetween(String value1, String value2) {
            addCriterion("edu_sync_status between", value1, value2, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEduSyncStatusNotBetween(String value1, String value2) {
            addCriterion("edu_sync_status not between", value1, value2, "eduSyncStatus");
            return (Criteria) this;
        }

        public Criteria andEnrolDateIsNull() {
            addCriterion("enrol_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrolDateIsNotNull() {
            addCriterion("enrol_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolDateEqualTo(String value) {
            addCriterion("enrol_date =", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateNotEqualTo(String value) {
            addCriterion("enrol_date <>", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateGreaterThan(String value) {
            addCriterion("enrol_date >", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateGreaterThanOrEqualTo(String value) {
            addCriterion("enrol_date >=", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateLessThan(String value) {
            addCriterion("enrol_date <", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateLessThanOrEqualTo(String value) {
            addCriterion("enrol_date <=", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateLike(String value) {
            addCriterion("enrol_date like", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateNotLike(String value) {
            addCriterion("enrol_date not like", value, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateIn(List<String> values) {
            addCriterion("enrol_date in", values, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateNotIn(List<String> values) {
            addCriterion("enrol_date not in", values, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateBetween(String value1, String value2) {
            addCriterion("enrol_date between", value1, value2, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andEnrolDateNotBetween(String value1, String value2) {
            addCriterion("enrol_date not between", value1, value2, "enrolDate");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIsNull() {
            addCriterion("graduate_time is null");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIsNotNull() {
            addCriterion("graduate_time is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeEqualTo(String value) {
            addCriterion("graduate_time =", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotEqualTo(String value) {
            addCriterion("graduate_time <>", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeGreaterThan(String value) {
            addCriterion("graduate_time >", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_time >=", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeLessThan(String value) {
            addCriterion("graduate_time <", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeLessThanOrEqualTo(String value) {
            addCriterion("graduate_time <=", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeLike(String value) {
            addCriterion("graduate_time like", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotLike(String value) {
            addCriterion("graduate_time not like", value, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeIn(List<String> values) {
            addCriterion("graduate_time in", values, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotIn(List<String> values) {
            addCriterion("graduate_time not in", values, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeBetween(String value1, String value2) {
            addCriterion("graduate_time between", value1, value2, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateTimeNotBetween(String value1, String value2) {
            addCriterion("graduate_time not between", value1, value2, "graduateTime");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNull() {
            addCriterion("graduate is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("graduate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(String value) {
            addCriterion("graduate =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(String value) {
            addCriterion("graduate <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(String value) {
            addCriterion("graduate >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("graduate >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(String value) {
            addCriterion("graduate <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(String value) {
            addCriterion("graduate <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLike(String value) {
            addCriterion("graduate like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotLike(String value) {
            addCriterion("graduate not like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<String> values) {
            addCriterion("graduate in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<String> values) {
            addCriterion("graduate not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(String value1, String value2) {
            addCriterion("graduate between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(String value1, String value2) {
            addCriterion("graduate not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIsNull() {
            addCriterion("speciality_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIsNotNull() {
            addCriterion("speciality_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameEqualTo(String value) {
            addCriterion("speciality_name =", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotEqualTo(String value) {
            addCriterion("speciality_name <>", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThan(String value) {
            addCriterion("speciality_name >", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThanOrEqualTo(String value) {
            addCriterion("speciality_name >=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThan(String value) {
            addCriterion("speciality_name <", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThanOrEqualTo(String value) {
            addCriterion("speciality_name <=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLike(String value) {
            addCriterion("speciality_name like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotLike(String value) {
            addCriterion("speciality_name not like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIn(List<String> values) {
            addCriterion("speciality_name in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotIn(List<String> values) {
            addCriterion("speciality_name not in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameBetween(String value1, String value2) {
            addCriterion("speciality_name between", value1, value2, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotBetween(String value1, String value2) {
            addCriterion("speciality_name not between", value1, value2, "specialityName");
            return (Criteria) this;
        }

        public Criteria andStudyResultIsNull() {
            addCriterion("study_result is null");
            return (Criteria) this;
        }

        public Criteria andStudyResultIsNotNull() {
            addCriterion("study_result is not null");
            return (Criteria) this;
        }

        public Criteria andStudyResultEqualTo(String value) {
            addCriterion("study_result =", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultNotEqualTo(String value) {
            addCriterion("study_result <>", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultGreaterThan(String value) {
            addCriterion("study_result >", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultGreaterThanOrEqualTo(String value) {
            addCriterion("study_result >=", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultLessThan(String value) {
            addCriterion("study_result <", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultLessThanOrEqualTo(String value) {
            addCriterion("study_result <=", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultLike(String value) {
            addCriterion("study_result like", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultNotLike(String value) {
            addCriterion("study_result not like", value, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultIn(List<String> values) {
            addCriterion("study_result in", values, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultNotIn(List<String> values) {
            addCriterion("study_result not in", values, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultBetween(String value1, String value2) {
            addCriterion("study_result between", value1, value2, "studyResult");
            return (Criteria) this;
        }

        public Criteria andStudyResultNotBetween(String value1, String value2) {
            addCriterion("study_result not between", value1, value2, "studyResult");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathIsNull() {
            addCriterion("id_card_photo_path is null");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathIsNotNull() {
            addCriterion("id_card_photo_path is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathEqualTo(String value) {
            addCriterion("id_card_photo_path =", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathNotEqualTo(String value) {
            addCriterion("id_card_photo_path <>", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathGreaterThan(String value) {
            addCriterion("id_card_photo_path >", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_photo_path >=", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathLessThan(String value) {
            addCriterion("id_card_photo_path <", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathLessThanOrEqualTo(String value) {
            addCriterion("id_card_photo_path <=", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathLike(String value) {
            addCriterion("id_card_photo_path like", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathNotLike(String value) {
            addCriterion("id_card_photo_path not like", value, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathIn(List<String> values) {
            addCriterion("id_card_photo_path in", values, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathNotIn(List<String> values) {
            addCriterion("id_card_photo_path not in", values, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathBetween(String value1, String value2) {
            addCriterion("id_card_photo_path between", value1, value2, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardPhotoPathNotBetween(String value1, String value2) {
            addCriterion("id_card_photo_path not between", value1, value2, "idCardPhotoPath");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusIsNull() {
            addCriterion("id_card_sync_status is null");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusIsNotNull() {
            addCriterion("id_card_sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusEqualTo(String value) {
            addCriterion("id_card_sync_status =", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusNotEqualTo(String value) {
            addCriterion("id_card_sync_status <>", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusGreaterThan(String value) {
            addCriterion("id_card_sync_status >", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_sync_status >=", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusLessThan(String value) {
            addCriterion("id_card_sync_status <", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusLessThanOrEqualTo(String value) {
            addCriterion("id_card_sync_status <=", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusLike(String value) {
            addCriterion("id_card_sync_status like", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusNotLike(String value) {
            addCriterion("id_card_sync_status not like", value, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusIn(List<String> values) {
            addCriterion("id_card_sync_status in", values, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusNotIn(List<String> values) {
            addCriterion("id_card_sync_status not in", values, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusBetween(String value1, String value2) {
            addCriterion("id_card_sync_status between", value1, value2, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardSyncStatusNotBetween(String value1, String value2) {
            addCriterion("id_card_sync_status not between", value1, value2, "idCardSyncStatus");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileIsNull() {
            addCriterion("reserve_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReserveMobileIsNotNull() {
            addCriterion("reserve_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReserveMobileEqualTo(String value) {
            addCriterion("reserve_mobile =", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileNotEqualTo(String value) {
            addCriterion("reserve_mobile <>", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileGreaterThan(String value) {
            addCriterion("reserve_mobile >", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_mobile >=", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileLessThan(String value) {
            addCriterion("reserve_mobile <", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileLessThanOrEqualTo(String value) {
            addCriterion("reserve_mobile <=", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileLike(String value) {
            addCriterion("reserve_mobile like", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileNotLike(String value) {
            addCriterion("reserve_mobile not like", value, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileIn(List<String> values) {
            addCriterion("reserve_mobile in", values, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileNotIn(List<String> values) {
            addCriterion("reserve_mobile not in", values, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileBetween(String value1, String value2) {
            addCriterion("reserve_mobile between", value1, value2, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andReserveMobileNotBetween(String value1, String value2) {
            addCriterion("reserve_mobile not between", value1, value2, "reserveMobile");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelId is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelId is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(Integer value) {
            addCriterion("channelId =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(Integer value) {
            addCriterion("channelId <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(Integer value) {
            addCriterion("channelId >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("channelId >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(Integer value) {
            addCriterion("channelId <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(Integer value) {
            addCriterion("channelId <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<Integer> values) {
            addCriterion("channelId in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<Integer> values) {
            addCriterion("channelId not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(Integer value1, Integer value2) {
            addCriterion("channelId between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("channelId not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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