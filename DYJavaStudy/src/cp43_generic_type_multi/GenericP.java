package cp43_generic_type_multi;
public class GenericP<T extends Person> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
