package factory_method.problema6.clase;
import java.util.List;

public interface Factory {
	public IShow createShow(String name, String location, String dateTime);

}
