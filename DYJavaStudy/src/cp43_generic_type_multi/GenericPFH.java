package cp43_generic_type_multi;
public class GenericPFH<T extends Person & Fly & Hidden> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
