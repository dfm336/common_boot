package com.dfm.boot.example.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "repository")
public class Repository {
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 标题名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 印发文号
     */
    @Column(name = "issue_number")
    private String issueNumber;

    /**
     * 印发公司
     */
    @Column(name = "issue_company")
    private String issueCompany;

    /**
     * 发文日期
     */
    @Column(name = "issue_time")
    private Date issueTime;

    /**
     * 施行日期
     */
    @Column(name = "impl_time")
    private Date implTime;

    /**
     * 到期日期
     */
    @Column(name = "maturity_time")
    private Date maturityTime;

    /**
     * 操作类型（0 新增，1修订）
     */
    @Column(name = "add_type")
    private Byte addType;

    /**
     * 是否试行（0是，1否）
     */
    @Column(name = "is_try")
    private Byte isTry;

    /**
     * 发布说明
     */
    @Column(name = "publish_content")
    private String publishContent;

    /**
     * 制度类型-业务分类
     */
    @Column(name = "biz_type")
    private String bizType;

    /**
     * 审核状态
     */
    @Column(name = "audit_status")
    private Byte auditStatus;

    /**
     * 所属机构id
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 创建用户
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 修改时间
     */
    @Column(name = "gmt_update")
    private Date gmtUpdate;

    /**
     * 修改用户
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 状态(0启用，1作废)
     */
    @Column(name = "status")
    private Byte status;

    /**
     * 知识库类型(  1制度，2 期刊 3 案列)
     */
    @Column(name = "lib_type")
    private Byte libType;

    /**
     * 印发部门-json数组
     */
    @Column(name = "issued_dept")
    private String issuedDept;

    /**
     * 关联制度
     */
    @Column(name = "relation")
    private String relation;

    /**
     * 试行结束时间
     */
    @Column(name = "try_end_time")
    private Date tryEndTime;

    /**
     * 当前审批用户
     */
    @Column(name = "cur_user")
    private String curUser;

    /**
     * 共享权限范围(0全部，1部分，2不共享）
     */
    @Column(name = "share_range")
    private Byte shareRange;

    /**
     * 审批任务id
     */
    @Column(name = "task_id")
    private Long taskId;

    /**
     * 附件url
     */
    @Column(name = "appendix")
    private String appendix;

    /**
     * 可见机构列表
     */
    @Column(name = "share_company")
    private String shareCompany;

    /**
     * 共享用户-json数组
     */
    @Column(name = "share_user")
    private String shareUser;

    /**
     * 前端共享用户树结构
     */
    @Column(name = "share_user_tree")
    private String shareUserTree;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String TITLE = "title";

    public static final String DB_TITLE = "title";

    public static final String ISSUE_NUMBER = "issueNumber";

    public static final String DB_ISSUE_NUMBER = "issue_number";

    public static final String ISSUE_COMPANY = "issueCompany";

    public static final String DB_ISSUE_COMPANY = "issue_company";

    public static final String ISSUE_TIME = "issueTime";

    public static final String DB_ISSUE_TIME = "issue_time";

    public static final String IMPL_TIME = "implTime";

    public static final String DB_IMPL_TIME = "impl_time";

    public static final String MATURITY_TIME = "maturityTime";

    public static final String DB_MATURITY_TIME = "maturity_time";

    public static final String ADD_TYPE = "addType";

    public static final String DB_ADD_TYPE = "add_type";

    public static final String IS_TRY = "isTry";

    public static final String DB_IS_TRY = "is_try";

    public static final String PUBLISH_CONTENT = "publishContent";

    public static final String DB_PUBLISH_CONTENT = "publish_content";

    public static final String BIZ_TYPE = "bizType";

    public static final String DB_BIZ_TYPE = "biz_type";

    public static final String AUDIT_STATUS = "auditStatus";

    public static final String DB_AUDIT_STATUS = "audit_status";

    public static final String ORG_ID = "orgId";

    public static final String DB_ORG_ID = "org_id";

    public static final String GMT_CREATE = "gmtCreate";

    public static final String DB_GMT_CREATE = "gmt_create";

    public static final String CREATE_BY = "createBy";

    public static final String DB_CREATE_BY = "create_by";

    public static final String GMT_UPDATE = "gmtUpdate";

    public static final String DB_GMT_UPDATE = "gmt_update";

    public static final String UPDATE_BY = "updateBy";

    public static final String DB_UPDATE_BY = "update_by";

    public static final String STATUS = "status";

    public static final String DB_STATUS = "status";

    public static final String LIB_TYPE = "libType";

    public static final String DB_LIB_TYPE = "lib_type";

    public static final String ISSUED_DEPT = "issuedDept";

    public static final String DB_ISSUED_DEPT = "issued_dept";

    public static final String RELATION = "relation";

    public static final String DB_RELATION = "relation";

    public static final String TRY_END_TIME = "tryEndTime";

    public static final String DB_TRY_END_TIME = "try_end_time";

    public static final String CUR_USER = "curUser";

    public static final String DB_CUR_USER = "cur_user";

    public static final String SHARE_RANGE = "shareRange";

    public static final String DB_SHARE_RANGE = "share_range";

    public static final String TASK_ID = "taskId";

    public static final String DB_TASK_ID = "task_id";

    public static final String APPENDIX = "appendix";

    public static final String DB_APPENDIX = "appendix";

    public static final String SHARE_COMPANY = "shareCompany";

    public static final String DB_SHARE_COMPANY = "share_company";

    public static final String SHARE_USER = "shareUser";

    public static final String DB_SHARE_USER = "share_user";

    public static final String SHARE_USER_TREE = "shareUserTree";

    public static final String DB_SHARE_USER_TREE = "share_user_tree";

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取标题名称
     *
     * @return title - 标题名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题名称
     *
     * @param title 标题名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取印发文号
     *
     * @return issue_number - 印发文号
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * 设置印发文号
     *
     * @param issueNumber 印发文号
     */
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     * 获取印发公司
     *
     * @return issue_company - 印发公司
     */
    public String getIssueCompany() {
        return issueCompany;
    }

    /**
     * 设置印发公司
     *
     * @param issueCompany 印发公司
     */
    public void setIssueCompany(String issueCompany) {
        this.issueCompany = issueCompany;
    }

    /**
     * 获取发文日期
     *
     * @return issue_time - 发文日期
     */
    public Date getIssueTime() {
        return issueTime;
    }

    /**
     * 设置发文日期
     *
     * @param issueTime 发文日期
     */
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    /**
     * 获取施行日期
     *
     * @return impl_time - 施行日期
     */
    public Date getImplTime() {
        return implTime;
    }

    /**
     * 设置施行日期
     *
     * @param implTime 施行日期
     */
    public void setImplTime(Date implTime) {
        this.implTime = implTime;
    }

    /**
     * 获取到期日期
     *
     * @return maturity_time - 到期日期
     */
    public Date getMaturityTime() {
        return maturityTime;
    }

    /**
     * 设置到期日期
     *
     * @param maturityTime 到期日期
     */
    public void setMaturityTime(Date maturityTime) {
        this.maturityTime = maturityTime;
    }

    /**
     * 获取操作类型（0 新增，1修订）
     *
     * @return add_type - 操作类型（0 新增，1修订）
     */
    public Byte getAddType() {
        return addType;
    }

    /**
     * 设置操作类型（0 新增，1修订）
     *
     * @param addType 操作类型（0 新增，1修订）
     */
    public void setAddType(Byte addType) {
        this.addType = addType;
    }

    /**
     * 获取是否试行（0是，1否）
     *
     * @return is_try - 是否试行（0是，1否）
     */
    public Byte getIsTry() {
        return isTry;
    }

    /**
     * 设置是否试行（0是，1否）
     *
     * @param isTry 是否试行（0是，1否）
     */
    public void setIsTry(Byte isTry) {
        this.isTry = isTry;
    }

    /**
     * 获取发布说明
     *
     * @return publish_content - 发布说明
     */
    public String getPublishContent() {
        return publishContent;
    }

    /**
     * 设置发布说明
     *
     * @param publishContent 发布说明
     */
    public void setPublishContent(String publishContent) {
        this.publishContent = publishContent;
    }

    /**
     * 获取制度类型-业务分类
     *
     * @return biz_type - 制度类型-业务分类
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * 设置制度类型-业务分类
     *
     * @param bizType 制度类型-业务分类
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * 获取审核状态
     *
     * @return audit_status - 审核状态
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置审核状态
     *
     * @param auditStatus 审核状态
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 获取所属机构id
     *
     * @return org_id - 所属机构id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置所属机构id
     *
     * @param orgId 所属机构id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取创建用户
     *
     * @return create_by - 创建用户
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建用户
     *
     * @param createBy 创建用户
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_update - 修改时间
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * 设置修改时间
     *
     * @param gmtUpdate 修改时间
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * 获取修改用户
     *
     * @return update_by - 修改用户
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改用户
     *
     * @param updateBy 修改用户
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取状态(0启用，1作废)
     *
     * @return status - 状态(0启用，1作废)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(0启用，1作废)
     *
     * @param status 状态(0启用，1作废)
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取知识库类型(  1制度，2 期刊 3 案列)
     *
     * @return lib_type - 知识库类型(  1制度，2 期刊 3 案列)
     */
    public Byte getLibType() {
        return libType;
    }

    /**
     * 设置知识库类型(  1制度，2 期刊 3 案列)
     *
     * @param libType 知识库类型(  1制度，2 期刊 3 案列)
     */
    public void setLibType(Byte libType) {
        this.libType = libType;
    }

    /**
     * 获取印发部门-json数组
     *
     * @return issued_dept - 印发部门-json数组
     */
    public String getIssuedDept() {
        return issuedDept;
    }

    /**
     * 设置印发部门-json数组
     *
     * @param issuedDept 印发部门-json数组
     */
    public void setIssuedDept(String issuedDept) {
        this.issuedDept = issuedDept;
    }

    /**
     * 获取关联制度
     *
     * @return relation - 关联制度
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置关联制度
     *
     * @param relation 关联制度
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * 获取试行结束时间
     *
     * @return try_end_time - 试行结束时间
     */
    public Date getTryEndTime() {
        return tryEndTime;
    }

    /**
     * 设置试行结束时间
     *
     * @param tryEndTime 试行结束时间
     */
    public void setTryEndTime(Date tryEndTime) {
        this.tryEndTime = tryEndTime;
    }

    /**
     * 获取当前审批用户
     *
     * @return cur_user - 当前审批用户
     */
    public String getCurUser() {
        return curUser;
    }

    /**
     * 设置当前审批用户
     *
     * @param curUser 当前审批用户
     */
    public void setCurUser(String curUser) {
        this.curUser = curUser;
    }

    /**
     * 获取共享权限范围(0全部，1部分，2不共享）
     *
     * @return share_range - 共享权限范围(0全部，1部分，2不共享）
     */
    public Byte getShareRange() {
        return shareRange;
    }

    /**
     * 设置共享权限范围(0全部，1部分，2不共享）
     *
     * @param shareRange 共享权限范围(0全部，1部分，2不共享）
     */
    public void setShareRange(Byte shareRange) {
        this.shareRange = shareRange;
    }

    /**
     * 获取审批任务id
     *
     * @return task_id - 审批任务id
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 设置审批任务id
     *
     * @param taskId 审批任务id
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取附件url
     *
     * @return appendix - 附件url
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * 设置附件url
     *
     * @param appendix 附件url
     */
    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    /**
     * 获取可见机构列表
     *
     * @return share_company - 可见机构列表
     */
    public String getShareCompany() {
        return shareCompany;
    }

    /**
     * 设置可见机构列表
     *
     * @param shareCompany 可见机构列表
     */
    public void setShareCompany(String shareCompany) {
        this.shareCompany = shareCompany;
    }

    /**
     * 获取共享用户-json数组
     *
     * @return share_user - 共享用户-json数组
     */
    public String getShareUser() {
        return shareUser;
    }

    /**
     * 设置共享用户-json数组
     *
     * @param shareUser 共享用户-json数组
     */
    public void setShareUser(String shareUser) {
        this.shareUser = shareUser;
    }

    /**
     * 获取前端共享用户树结构
     *
     * @return share_user_tree - 前端共享用户树结构
     */
    public String getShareUserTree() {
        return shareUserTree;
    }

    /**
     * 设置前端共享用户树结构
     *
     * @param shareUserTree 前端共享用户树结构
     */
    public void setShareUserTree(String shareUserTree) {
        this.shareUserTree = shareUserTree;
    }
}