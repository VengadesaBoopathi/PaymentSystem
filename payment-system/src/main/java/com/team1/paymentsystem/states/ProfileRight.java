package com.team1.paymentsystem.states;

public enum ProfileRight {
    LIST_USER, LIST_ACCOUNT, LIST_PROFILE,
    CREATE_USER, CREATE_ACCOUNT, CREATE_PROFILE,
    MODIFY_USER, MODIFY_ACCOUNT, MODIFY_PROFILE,
    BLOCK_USER,
    UNBLOCK_USER,
    REMOVE_USER, REMOVE_ACCOUNT, REMOVE_PROFILE,
    APPROVE_USER, APPROVE_ACCOUNT, APPROVE_PROFILE,
    REJECT_USER, REJECT_ACCOUNT, REJECT_PROFILE,
    LIST_PAYMENT,CREATE_PAYMENT, REPAIR_PAYMENT, VERIFY_PAYMENT, APPROVE_PAYMENT, CANCEL_PAYMENT, AUTHORIZE_PAYMENT
}