package builder.problema3.clase;

public class BuilderAutobuzLinie implements Builder {
	public AutobuzLinie autobuzLinie;
	
	public BuilderAutobuzLinie(String modelAutobuz) {
		this.autobuzLinie= new AutobuzLinie();
		this.autobuzLinie.setModelAutobuz(modelAutobuz);
	}

	@Override
	public AutobuzLinie build() {
		return this.autobuzLinie;
	}
	
	public BuilderAutobuzLinie setModelAutobuz(String modelAutobuz) {
		this.autobuzLinie.setModelAutobuz(modelAutobuz);
		return this;
	}
	
	public BuilderAutobuzLinie setNumeSofer(String numeSofer) {
		this.autobuzLinie.setNumeSofer(numeSofer);
		return this;
	}
	
	public BuilderAutobuzLinie setAreOprireLaCapatulLiniei(Boolean areOprireLaCapatulLiniei ) {
		this.autobuzLinie.setAreOprireLaCapatulLiniei(areOprireLaCapatulLiniei);
		return this;
	}
	
	public BuilderAutobuzLinie setDeschideUsile(Boolean deschideUsile ) {
		this.autobuzLinie.setDeschideUsile(deschideUsile);
		return this;
	}
	
	public BuilderAutobuzLinie setTextulAfisatDerulator(Boolean textulAfisatDerulator ) {
		this.autobuzLinie.setTextulAfisatDerulator(textulAfisatDerulator);
		return this;
	}
}
