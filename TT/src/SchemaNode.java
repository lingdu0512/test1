

import java.io.Serializable;

public interface SchemaNode extends Serializable {
	public void validate() throws Exception;
}
