package ru.hzerr.generated.debugger;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class WasmDisassemblyChunk {

	@Required
	@Description("The next chunk of disassembled lines.")
	private String[] lines;

	@Required
	@Description("The bytecode offsets describing the start of each line.")
	private int[] bytecodeOffsets;

    public WasmDisassemblyChunk() {
    }

	public String[] getLines() {
		return this.lines;
	}
	public void setLines(String[] lines) {
		this.lines = lines;
	}
	public int[] getBytecodeOffsets() {
		return this.bytecodeOffsets;
	}
	public void setBytecodeOffsets(int[] bytecodeOffsets) {
		this.bytecodeOffsets = bytecodeOffsets;
	}
}
