// automatically generated by the FlatBuffers compiler, do not modify

package org.locationtech.geogig.flatbuffers.generated.v1.values;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FLOAT extends Table {
  public static FLOAT getRootAsFLOAT(ByteBuffer _bb) { return getRootAsFLOAT(_bb, new FLOAT()); }
  public static FLOAT getRootAsFLOAT(ByteBuffer _bb, FLOAT obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FLOAT __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float value() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createFLOAT(FlatBufferBuilder builder,
      float value) {
    builder.startObject(1);
    FLOAT.addValue(builder, value);
    return FLOAT.endFLOAT(builder);
  }

  public static void startFLOAT(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addValue(FlatBufferBuilder builder, float value) { builder.addFloat(0, value, 0.0f); }
  public static int endFLOAT(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

