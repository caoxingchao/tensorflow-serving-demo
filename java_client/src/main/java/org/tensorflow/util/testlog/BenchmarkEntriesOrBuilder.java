// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/test_log.proto

package org.tensorflow.util.testlog;

public interface BenchmarkEntriesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.BenchmarkEntries)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.BenchmarkEntry entry = 1;</code>
   */
  java.util.List<org.tensorflow.util.testlog.BenchmarkEntry> 
      getEntryList();
  /**
   * <code>repeated .tensorflow.BenchmarkEntry entry = 1;</code>
   */
  org.tensorflow.util.testlog.BenchmarkEntry getEntry(int index);
  /**
   * <code>repeated .tensorflow.BenchmarkEntry entry = 1;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .tensorflow.BenchmarkEntry entry = 1;</code>
   */
  java.util.List<? extends org.tensorflow.util.testlog.BenchmarkEntryOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <code>repeated .tensorflow.BenchmarkEntry entry = 1;</code>
   */
  org.tensorflow.util.testlog.BenchmarkEntryOrBuilder getEntryOrBuilder(
      int index);
}
