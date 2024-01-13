package cn.iocoder.yudao.module.crm.enums;

import static cn.iocoder.yudao.module.crm.enums.operatelog.CrmParseFunctionNameConstants.GET_CONTRACT_BY_ID;
import static cn.iocoder.yudao.module.system.enums.operatelog.SysParseFunctionNameConstants.GET_ADMIN_USER_BY_ID;

/**
 * CRM 操作日志枚举
 * 目的：统一管理，也减少 Service 里各种“复杂”字符串
 *
 * @author HUIHUI
 */
public interface LogRecordConstants {

    // ======================= CRM_LEADS 线索 =======================

    String CRM_LEADS_TYPE = "CRM 线索";

    // ======================= CRM_CUSTOMER 客户 =======================

    String CRM_CUSTOMER_TYPE = "CRM 客户";
    String CRM_CUSTOMER_CREATE_SUB_TYPE = "创建客户";
    String CRM_CUSTOMER_CREATE_SUCCESS = "创建了客户{{#customer.name}}";
    String CRM_CUSTOMER_UPDATE_SUB_TYPE = "更新客户";
    String CRM_CUSTOMER_UPDATE_SUCCESS = "更新了客户【{{#customerName}}】: {_DIFF{#updateReqVO}}";
    String CRM_CUSTOMER_DELETE_SUB_TYPE = "删除客户";
    String CRM_CUSTOMER_DELETE_SUCCESS = "删除了客户【{{#customerName}}】";
    String CRM_CUSTOMER_TRANSFER_SUB_TYPE = "转移客户";
    String CRM_CUSTOMER_TRANSFER_SUCCESS = "将客户【{{#customer.name}}】的负责人从【{" + GET_ADMIN_USER_BY_ID + "{#customer.ownerUserId}}】变更为了【{" + GET_ADMIN_USER_BY_ID + "{#reqVO.newOwnerUserId}}】";
    String CRM_CUSTOMER_LOCK_SUB_TYPE = "{{#customer.lockStatus ? '解锁客户' : '锁定客户'}}";
    String CRM_CUSTOMER_LOCK_SUCCESS = "{{#customer.lockStatus ? '将客户【' + #customer.name + '】解锁' : '将客户【' + #customer.name + '】锁定'}}";
    String CRM_CUSTOMER_POOL_SUB_TYPE = "客户放入公海";
    String CRM_CUSTOMER_POOL_SUCCESS = "将客户【{{#customerName}}】放入了公海";
    String CRM_CUSTOMER_RECEIVE_SUB_TYPE = "{{#ownerUserName != null ? '分配客户' : '领取客户'}}";
    String CRM_CUSTOMER_RECEIVE_SUCCESS = "{{#ownerUserName != null ? '将客户【' + #customer.name + '】分配给【' + #ownerUserName + '】' : '领取客户【' + #customer.name + '】'}}";

    // ======================= CRM_CUSTOMER_LIMIT_CONFIG 客户限制配置 =======================

    String CRM_CUSTOMER_LIMIT_CONFIG_TYPE = "CRM 客户限制配置";
    String CRM_CUSTOMER_LIMIT_CONFIG_CREATE_SUB_TYPE = "创建客户限制配置";
    String CRM_CUSTOMER_LIMIT_CONFIG_CREATE_SUCCESS = "创建了【{{#limitType}}】类型的客户限制配置";
    String CRM_CUSTOMER_LIMIT_CONFIG_UPDATE_SUB_TYPE = "更新客户限制配置";
    String CRM_CUSTOMER_LIMIT_CONFIG_UPDATE_SUCCESS = "更新了客户限制配置: {_DIFF{#updateReqVO}}";
    String CRM_CUSTOMER_LIMIT_CONFIG_DELETE_SUB_TYPE = "删除客户限制配置";
    String CRM_CUSTOMER_LIMIT_CONFIG_DELETE_SUCCESS = "删除了【{{#limitType}}】类型的客户限制配置";

    // ======================= CRM_CUSTOMER_POOL_CONFIG 客户公海规则 =======================

    String CRM_CUSTOMER_POOL_CONFIG_TYPE = "CRM 客户公海规则";
    String CRM_CUSTOMER_POOL_CONFIG_SUB_TYPE = "{{#isPoolConfigUpdate ? '更新客户公海规则' : '创建客户公海规则'}}";
    String CRM_CUSTOMER_POOL_CONFIG_SUCCESS = "{{#isPoolConfigUpdate ? '更新了客户公海规则' : '创建了客户公海规则'}}";

    // ======================= CRM_CONTACT 联系人 =======================

    String CRM_CONTACT_TYPE = "CRM 联系人";
    String CRM_CONTACT_CREATE_SUB_TYPE = "创建联系人";
    String CRM_CONTACT_CREATE_SUCCESS = "创建了联系人{{#contact.name}}";
    String CRM_CONTACT_UPDATE_SUB_TYPE = "更新联系人";
    String CRM_CONTACT_UPDATE_SUCCESS = "更新了联系人【{{#contactName}}】: {_DIFF{#updateReqVO}}";
    String CRM_CONTACT_DELETE_SUB_TYPE = "删除联系人";
    String CRM_CONTACT_DELETE_SUCCESS = "删除了联系人【{{#contactName}}】";
    String CRM_CONTACT_TRANSFER_SUB_TYPE = "转移联系人";
    String CRM_CONTACT_TRANSFER_SUCCESS = "将联系人【{{#contact.name}}】的负责人从【{" + GET_ADMIN_USER_BY_ID + "{#contact.ownerUserId}}】变更为了【{" + GET_ADMIN_USER_BY_ID + "{#reqVO.newOwnerUserId}}】";

    // ======================= CRM_BUSINESS 商机 =======================

    String CRM_BUSINESS_TYPE = "CRM 商机";
    String CRM_BUSINESS_CREATE_SUB_TYPE = "创建商机";
    String CRM_BUSINESS_CREATE_SUCCESS = "创建了商机{{#business.name}}";
    String CRM_BUSINESS_UPDATE_SUB_TYPE = "更新商机";
    String CRM_BUSINESS_UPDATE_SUCCESS = "更新了商机【{{#businessName}}】: {_DIFF{#updateReqVO}}";
    String CRM_BUSINESS_DELETE_SUB_TYPE = "删除商机";
    String CRM_BUSINESS_DELETE_SUCCESS = "删除了商机【{{#businessName}}】";
    String CRM_BUSINESS_TRANSFER_SUB_TYPE = "转移商机";
    String CRM_BUSINESS_TRANSFER_SUCCESS = "将商机【{{#business.name}}】的负责人从【{" + GET_ADMIN_USER_BY_ID + "{#business.ownerUserId}}】变更为了【{" + GET_ADMIN_USER_BY_ID + "{#reqVO.newOwnerUserId}}】";

    // ======================= CRM_CONTRACT 合同 =======================

    String CRM_CONTRACT_TYPE = "CRM 合同";
    String CRM_CONTRACT_CREATE_SUB_TYPE = "创建合同";
    String CRM_CONTRACT_CREATE_SUCCESS = "创建了合同{{#contract.name}}";
    String CRM_CONTRACT_UPDATE_SUB_TYPE = "更新合同";
    String CRM_CONTRACT_UPDATE_SUCCESS = "更新了合同【{{#contractName}}】: {_DIFF{#updateReqVO}}";
    String CRM_CONTRACT_DELETE_SUB_TYPE = "删除合同";
    String CRM_CONTRACT_DELETE_SUCCESS = "删除了合同【{{#contractName}}】";
    String CRM_CONTRACT_TRANSFER_SUB_TYPE = "转移合同";
    String CRM_CONTRACT_TRANSFER_SUCCESS = "将合同【{{#contract.name}}】的负责人从【{" + GET_ADMIN_USER_BY_ID + "{#contract.ownerUserId}}】变更为了【{" + GET_ADMIN_USER_BY_ID + "{#reqVO.newOwnerUserId}}】";

    // ======================= CRM_PRODUCT 产品 =======================

    String CRM_PRODUCT_TYPE = "CRM 产品";
    String CRM_PRODUCT_CREATE_SUB_TYPE = "创建产品";
    String CRM_PRODUCT_CREATE_SUCCESS = "创建了产品【{{#createReqVO.name}}】";
    String CRM_PRODUCT_UPDATE_SUB_TYPE = "更新产品";
    String CRM_PRODUCT_UPDATE_SUCCESS = "更新了产品【{{#updateReqVO.name}}】: {_DIFF{#updateReqVO}}";
    String CRM_PRODUCT_DELETE_SUB_TYPE = "删除产品";
    String CRM_PRODUCT_DELETE_SUCCESS = "删除了产品【{{#product.name}}】";

    // ======================= CRM_PRODUCT_CATEGORY 产品分类 =======================

    String CRM_PRODUCT_CATEGORY_TYPE = "CRM 产品分类";
    String CRM_PRODUCT_CATEGORY_CREATE_SUB_TYPE = "创建产品分类";
    String CRM_PRODUCT_CATEGORY_CREATE_SUCCESS = "创建了产品分类【{{#createReqVO.name}}】";
    String CRM_PRODUCT_CATEGORY_UPDATE_SUB_TYPE = "更新产品分类";
    String CRM_PRODUCT_CATEGORY_UPDATE_SUCCESS = "更新了产品分类【{{#updateReqVO.name}}】: {_DIFF{#updateReqVO}}";
    String CRM_PRODUCT_CATEGORY_DELETE_SUB_TYPE = "删除产品分类";
    String CRM_PRODUCT_CATEGORY_DELETE_SUCCESS = "删除了产品分类【{{#productCategory.name}}】";

    // ======================= CRM_RECEIVABLE 回款 =======================

    String CRM_RECEIVABLE_TYPE = "CRM 回款";
    String CRM_RECEIVABLE_CREATE_SUB_TYPE = "创建回款";
    String CRM_RECEIVABLE_CREATE_SUCCESS = "创建了合同【{" + GET_CONTRACT_BY_ID + "{#receivable.contractId}}】的第【{{#receivable.period}}】期回款";
    String CRM_RECEIVABLE_UPDATE_SUB_TYPE = "更新回款";
    String CRM_RECEIVABLE_UPDATE_SUCCESS = "更新了合同【{" + GET_CONTRACT_BY_ID + "{#receivable.contractId}}】的第【{{#receivable.period}}】期回款: {_DIFF{#updateReqVO}}";
    String CRM_RECEIVABLE_DELETE_SUB_TYPE = "删除回款";
    String CRM_RECEIVABLE_DELETE_SUCCESS = "删除了合同【{" + GET_CONTRACT_BY_ID + "{#receivable.contractId}}】的第【{{#receivable.period}}】期回款";

    // ======================= CRM_RECEIVABLE_PLAN 回款计划 =======================

    String CRM_RECEIVABLE_PLAN_TYPE = "CRM 回款计划";
    String CRM_RECEIVABLE_PLAN_CREATE_SUB_TYPE = "创建回款计划";
    String CRM_RECEIVABLE_PLAN_CREATE_SUCCESS = "创建了合同【{" + GET_CONTRACT_BY_ID + "{#receivablePlan.contractId}}】的第【{{#receivablePlan.period}}】期回款计划";
    String CRM_RECEIVABLE_PLAN_UPDATE_SUB_TYPE = "更新回款计划";
    String CRM_RECEIVABLE_PLAN_UPDATE_SUCCESS = "更新了合同【{" + GET_CONTRACT_BY_ID + "{#receivablePlan.contractId}}】的第【{{#receivablePlan.period}}】期回款计划: {_DIFF{#updateReqVO}}";
    String CRM_RECEIVABLE_PLAN_DELETE_SUB_TYPE = "删除回款计划";
    String CRM_RECEIVABLE_PLAN_DELETE_SUCCESS = "删除了合同【{" + GET_CONTRACT_BY_ID + "{#receivablePlan.contractId}}】的第【{{#receivablePlan.period}}】期回款计划";

}
