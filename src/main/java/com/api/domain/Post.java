package com.api.domain;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private Date date;
	private String title;
	private String body;
}
