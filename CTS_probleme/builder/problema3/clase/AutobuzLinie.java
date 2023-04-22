package builder.problema3.clase;

public class AutobuzLinie {
	private String modelAutobuz;
	private String numeSofer;
	private Boolean areOprireLaCapatulLiniei;
	private Boolean deschideUsile;
	private Boolean textulAfisatDerulator;
	
	private static AutobuzLinie instanta = null;
	
	
	private AutobuzLinie(String modelAutobuz, String numeSofer, Boolean areOprireLaCapatulLiniei, Boolean deschideUsile,
			Boolean textulAfisatDerulator) {
		super();
		this.modelAutobuz = modelAutobuz;
		this.numeSofer = numeSofer;
		this.areOprireLaCapatulLiniei = areOprireLaCapatulLiniei;
		this.deschideUsile = deschideUsile;
		this.textulAfisatDerulator = textulAfisatDerulator;
	}

	public AutobuzLinie() {
		this.modelAutobuz= "Anonim";
		this.numeSofer="Anonim";
		this.areOprireLaCapatulLiniei= false;
		this.deschideUsile= false;
		this.textulAfisatDerulator= false;
	}

	public void setModelAutobuz(String modelAutobuz) {
		this.modelAutobuz = modelAutobuz;
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public void setAreOprireLaCapatulLiniei(Boolean areOprireLaCapatulLiniei) {
		this.areOprireLaCapatulLiniei = areOprireLaCapatulLiniei;
	}

	public void setDeschideUsile(Boolean deschideUsile) {
		this.deschideUsile = deschideUsile;
	}

	public void setTextulAfisatDerulator(Boolean textulAfisatDerulator) {
		this.textulAfisatDerulator = textulAfisatDerulator;
	}
	public static AutobuzLinie getInstanta(String modelAutobuz, String numeSofer, Boolean areOprireLaCapatulLiniei,Boolean deschideUsile,Boolean textulAfisatDerulator) {
		if(instanta == null) {
			instanta= new AutobuzLinie(modelAutobuz,numeSofer,areOprireLaCapatulLiniei,deschideUsile,textulAfisatDerulator);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "AutobuzLinie " + modelAutobuz + " condus de "  + numeSofer + ", areOprireLaCapatulLiniei= "
				+ areOprireLaCapatulLiniei + ", deschideUsile= " + deschideUsile + ", textulAfisatDerulator= "
				+ textulAfisatDerulator ;
	}
	
	

}
