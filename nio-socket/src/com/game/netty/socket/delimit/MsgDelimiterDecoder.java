package com.game.netty.socket.delimit;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;


public class MsgDelimiterDecoder extends DelimiterBasedFrameDecoder{

	public MsgDelimiterDecoder(int maxFrameLength, ByteBuf delimiter) {
		super(maxFrameLength, delimiter);
	}
	
	
}
