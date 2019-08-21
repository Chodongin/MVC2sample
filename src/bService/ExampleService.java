package bService;

import java.io.Serializable;

import dModel.ExampleDto;

public interface ExampleService extends Serializable{
	public ExampleDto loginAction(ExampleDto param);
}
