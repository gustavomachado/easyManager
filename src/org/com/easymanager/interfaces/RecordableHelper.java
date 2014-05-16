package org.com.easymanager.interfaces;

import java.io.Serializable;

public interface RecordableHelper extends Serializable{

	public Recordable createRecordable();
	public Recordable getRecordable();
	public void setRecordable(Recordable recordable);
	public void showRecordableData(Recordable recordable);
}
