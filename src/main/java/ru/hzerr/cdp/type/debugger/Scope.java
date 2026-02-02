package ru.hzerr.cdp.type.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.cdp.type.runtime.RemoteObject;

@Description("Scope description.")
public class Scope {

	@Required
	@Description("Scope type.")
	@Enum({"global", "local", "with", "closure", "catch", "block", "script", "eval", "module", "wasm-expression-stack"})
	private String type;

	@Required
	@Description("Object representing the scope. For `global` and `with` scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.")
	private RemoteObject object;

	private String name;

	@Description("Location in the source code where scope starts")
	private Location startLocation;

	@Description("Location in the source code where scope ends")
	private Location endLocation;

    public Scope() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public RemoteObject getObject() {
		return this.object;
	}
	public void setObject(RemoteObject object) {
		this.object = object;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getStartLocation() {
		return this.startLocation;
	}
	public void setStartLocation(Location startLocation) {
		this.startLocation = startLocation;
	}
	public Location getEndLocation() {
		return this.endLocation;
	}
	public void setEndLocation(Location endLocation) {
		this.endLocation = endLocation;
	}
}
