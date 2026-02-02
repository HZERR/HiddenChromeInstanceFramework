package ru.hzerr.cdp.type.memory;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Executable module information")
public class Module {

	@Required
	@Description("Name of the module.")
	private String name;

	@Required
	@Description("UUID of the module.")
	private String uuid;

	@Required
	@Description("Base address where the module is loaded into memory. Encoded as a decimal or hexadecimal (0x prefixed) string.")
	private String baseAddress;

	@Required
	@Description("Size of the module in bytes.")
	private Number size;

    public Module() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getBaseAddress() {
		return this.baseAddress;
	}
	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}
	public Number getSize() {
		return this.size;
	}
	public void setSize(Number size) {
		this.size = size;
	}
}
