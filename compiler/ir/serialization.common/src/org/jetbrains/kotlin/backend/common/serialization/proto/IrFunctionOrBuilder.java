// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrFunction)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrFunctionBase base = 1;</code>
   */
  boolean hasBase();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrFunctionBase base = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrFunctionBase getBase();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.ModalityKind modality = 2;</code>
   */
  boolean hasModality();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.ModalityKind modality = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.ModalityKind getModality();

  /**
   * <code>required bool is_tailrec = 3;</code>
   */
  boolean hasIsTailrec();
  /**
   * <code>required bool is_tailrec = 3;</code>
   */
  boolean getIsTailrec();

  /**
   * <code>required bool is_suspend = 4;</code>
   */
  boolean hasIsSuspend();
  /**
   * <code>required bool is_suspend = 4;</code>
   */
  boolean getIsSuspend();

  /**
   * <code>repeated int32 overridden = 5;</code>
   */
  java.util.List<java.lang.Integer> getOverriddenList();
  /**
   * <code>repeated int32 overridden = 5;</code>
   */
  int getOverriddenCount();
  /**
   * <code>repeated int32 overridden = 5;</code>
   */
  int getOverridden(int index);

  /**
   * <code>required bool is_fake_override = 8;</code>
   *
   * <pre>
   *optional UniqId corresponding_property = 7;
   * </pre>
   */
  boolean hasIsFakeOverride();
  /**
   * <code>required bool is_fake_override = 8;</code>
   *
   * <pre>
   *optional UniqId corresponding_property = 7;
   * </pre>
   */
  boolean getIsFakeOverride();

  /**
   * <code>required bool is_operator = 9;</code>
   */
  boolean hasIsOperator();
  /**
   * <code>required bool is_operator = 9;</code>
   */
  boolean getIsOperator();
}