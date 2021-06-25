// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// Traces the execution of operations, doing eager garbage collection, and
// exporting a full trace so other code can do backpropagation. Not thread-safe.
@Name("tensorflow::eager::GradientTape<tensorflow::AbstractTensorHandle,tensorflow::gradients::GradientFunction,tensorflow::gradients::TapeTensor>") @NoOffset @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class Tape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tape(Pointer p) { super(p); }

  // If `persistent` is true, GradientTape will not eagerly delete backward
  // functions (and hence the tensors they keep alive). Instead, everything
  // is deleted in ~GradientTape. Persistent GradientTapes are useful when
  // users want to compute multiple gradients over the same tape.
  public Tape(@Cast("bool") boolean persistent) { super((Pointer)null); allocate(persistent); }
  private native void allocate(@Cast("bool") boolean persistent);

  // Returns whether any tensor in a list of tensors is being watched and has
  // a trainable dtype.
  public native @Cast("bool") boolean ShouldRecord(@Cast("tensorflow::int64*") @Span LongPointer tensor_ids,
                      @Cast("tensorflow::DataType*") @Span IntPointer dtypes);
  public native @Cast("bool") boolean ShouldRecord(@Cast("tensorflow::int64*") @Span LongBuffer tensor_ids,
                      @Cast("tensorflow::DataType*") @Span IntBuffer dtypes);
  public native @Cast("bool") boolean ShouldRecord(@Cast("tensorflow::int64*") @Span long[] tensor_ids,
                      @Cast("tensorflow::DataType*") @Span int[] dtypes);

  // Adds this tensor to the list of watched tensors.
  //
  // This is a no-op if the tensor is already being watched either from an
  // earlier call to `GradientTape::Watch` or being an output of an op with
  // watched inputs.
  public native void Watch(@Cast("tensorflow::int64") long tensor_id);

  // Records an operation with inputs `input_tensor_id` and outputs
  // `output_tensors` on the tape and marks all its outputs as watched if at
  // least one input of the op is watched and has trainable dtype.
  //
  // op_type is used to decide which of the incoming gradients can be left as
  // nullptr instead of building zeros when build_default_zeros_grads == true.
  public native void RecordOperation(
        @StdString BytePointer op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span LongPointer input_tensor_id,
        @Cast("tensorflow::DataType*") @Span IntPointer input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);
  public native void RecordOperation(
        @StdString String op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span LongBuffer input_tensor_id,
        @Cast("tensorflow::DataType*") @Span IntBuffer input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);
  public native void RecordOperation(
        @StdString BytePointer op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span long[] input_tensor_id,
        @Cast("tensorflow::DataType*") @Span int[] input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);
  public native void RecordOperation(
        @StdString String op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span LongPointer input_tensor_id,
        @Cast("tensorflow::DataType*") @Span IntPointer input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);
  public native void RecordOperation(
        @StdString BytePointer op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span LongBuffer input_tensor_id,
        @Cast("tensorflow::DataType*") @Span IntBuffer input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);
  public native void RecordOperation(
        @StdString String op_type, @StdVector TapeTensor output_tensors,
        @Cast("tensorflow::int64*") @Span long[] input_tensor_id,
        @Cast("tensorflow::DataType*") @Span int[] input_dtypes,
        @Const @ByRef GradientFunctionGetter backward_function_getter,
        @Const @ByRef GradientFunctionDeleter backward_function_deleter);

  public native void DeleteTrace(@Cast("tensorflow::int64") long tensor_id);

  // Consumes the internal state of the tape (so cannot be called more than
  // once) and produces the gradient of the target tensors with respect to the
  // source tensors. The output gradients are used if not empty and not
  // null. The result is populated with one tensor per target element.
  // When running backward functions, builds zeros-like tensors for
  // incoming grads which are nullptrs, unless `build_default_zeros_grads`
  // is set to false.
  public native @ByVal Status ComputeGradient(
        @Const @ByRef TapeVSpace vspace,
        @Cast("tensorflow::int64*") @Span LongPointer target_tensor_ids,
        @Cast("tensorflow::int64*") @Span LongPointer source_tensor_ids,
        @Const @ByRef LongTapeTensorMap sources_that_are_targets,
        @Cast("tensorflow::AbstractTensorHandle**") @Span PointerPointer<AbstractTensorHandle> output_gradients,
        @Cast("tensorflow::AbstractTensorHandle**") @Span PointerPointer<AbstractTensorHandle> result, @Cast("bool") boolean build_default_zeros_grads/*=true*/);

  // Whether the tape is persistent. See ctor for detailed description.
  public native @Cast("bool") boolean IsPersistent();
}
