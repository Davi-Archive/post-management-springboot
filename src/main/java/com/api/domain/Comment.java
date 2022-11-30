package com.api.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String text;
	private Date date;
}
