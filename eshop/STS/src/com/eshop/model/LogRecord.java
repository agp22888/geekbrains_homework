package com.eshop.model;

public class LogRecord {
	private String id, date, tableName, operation, result;

	public LogRecord(String tableName, String operation, String result) {
		this.tableName = tableName;
		this.operation = operation;
		this.result = result;
	}

	public LogRecord(String id, String date, String tableName, String operation, String result) {
		this(tableName, operation, result);
		this.id = id;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getTableName() {
		return tableName;
	}

	public String getOperation() {
		return operation;
	}

	public String getResult() {
		return result;
	}

	@Override
	public String toString() {
		String outputString = "";
		if (id == null || date == null) {
			result = String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>", tableName, operation, result);
		} else {
			result = String.format("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>", id, date,
					tableName, operation, result);
		}
		return outputString;
	}
}