// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package com.vinsguru.models;

public interface TransferResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransferResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.TransferStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.TransferStatus status = 1;</code>
   * @return The status.
   */
  com.vinsguru.models.TransferStatus getStatus();

  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<com.vinsguru.models.Account> 
      getAccountsList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.vinsguru.models.Account getAccounts(int index);
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<? extends com.vinsguru.models.AccountOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.vinsguru.models.AccountOrBuilder getAccountsOrBuilder(
      int index);
}
