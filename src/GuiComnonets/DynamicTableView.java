package GuiComnonets;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.*;

public class DynamicTableView {
	private static final int N_COLS = 0;
	private static final int N_ROWS = 0;
	private TableView<ObservableList<String>> tableView;
	private List<String> columnNames;

	public DynamicTableView() {
		// TODO Auto-generated constructor stub
		tableView = new TableView<>();
		tableView.setPrefHeight(200);
		tableView.setPrefWidth(300);
	}

	public void SetColumns(List<String> Columns) {

		columnNames = Columns;
		for (int i = 0; i < Columns.size(); i++) {
			final int finalIdx = i;
			TableColumn<ObservableList<String>, String> column = new TableColumn<>(Columns.get(i));
			column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().get(finalIdx)));
			column.setPrefWidth(135);
			tableView.getColumns().add(column);
		}
	}

	public TableView<ObservableList<String>> getTableView() {
		return tableView;
	}

	public void setTableView(TableView<ObservableList<String>> tableView) {
		this.tableView = tableView;
	}

	public List<String> getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(List<String> columnNames) {
		this.columnNames = columnNames;
	}

	public static int getnCols() {
		return N_COLS;
	}

	public static int getnRows() {
		return N_ROWS;
	}

	public void addItems(List<String> Items) {

			tableView.getItems().add(FXCollections.observableArrayList(Items));


	}

}