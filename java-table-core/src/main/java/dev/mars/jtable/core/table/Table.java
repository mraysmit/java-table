package dev.mars.jtable.core.table;

import dev.mars.jtable.core.model.ITable;
import dev.mars.jtable.core.model.IColumn;
import dev.mars.jtable.core.model.IRow;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of ITable that delegates to a TableCore instance.
 * This class serves as a wrapper around TableCore.
 */
public class Table implements ITable {
    private final TableCore tableCore;

    private boolean createDefaultValue = true;

    public Table() {
        this.tableCore = new TableCore();
        this.tableCore.setName("Table");
    }

    /**
     * Creates a new Table with the specified name.
     *
     * @param name the name of the table
     */
    public Table(String name) {
        this.tableCore = new TableCore();
        this.tableCore.setName(name);
    }

    @Override
    public void setColumns(LinkedHashMap<String, String> columns) {
        tableCore.setColumns(columns);
    }

    @Override
    public Object convertValue(String value, IColumn<?> column) {
        return tableCore.convertValue(value, column);
    }

    @Override
    public String getValueAt(int rowIndex, String columnName) {
        return tableCore.getValueAt(rowIndex, columnName);
    }

    @Override
    public void setValueAt(int rowIndex, String columnName, String value) {tableCore.setValueAt(rowIndex, columnName, value);}

    @Override
    public String inferType(String value) {
        return tableCore.inferType(value);
    }

    @Override
    public void setCreateDefaultValue(boolean createDefaultValue) {tableCore.setCreateDefaultValue(createDefaultValue);}

    @Override
    public boolean isCreateDefaultValue() {return tableCore.isCreateDefaultValue();}

    @Override
    public String getDefaultValue(String type) {
        return tableCore.getDefaultValue(type);
    }

    @Override
    public IColumn<?> getColumn(String name) {
        return tableCore.getColumn(name);
    }

    @Override
    public IColumn<?> getColumn(int index) {
        return tableCore.getColumn(index);
    }

    @Override
    public List<IColumn<?>> getColumns() {
        return tableCore.getColumns();
    }

    @Override
    public void addColumn(IColumn<?> column) {
        tableCore.addColumn(column);
    }

    @Override
    public IRow getRow(int index) {
        return tableCore.getRow(index);
    }

    @Override
    public List<IRow> getRows() {
        return tableCore.getRows();
    }

    @Override
    public void addRow(IRow row) {
        tableCore.addRow(row);
    }

    @Override
    public void addRow(Map<String, String> row) {
        tableCore.addRow(row);
    }

    @Override
    public IRow createRow() {
        return tableCore.createRow();
    }

    @Override
    public int getRowCount() {
        return tableCore.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return tableCore.getColumnCount();
    }

    @Override
    public Object getValueObject(int rowIndex, String columnName) {
        return tableCore.getValueObject(rowIndex, columnName);
    }

    @Override
    public void setValue(int rowIndex, String columnName, Object value) {tableCore.setValue(rowIndex, columnName, value);}

    @Override
    public void printTable() {
        tableCore.printTable();
    }

    @Override
    public String getColumnName(int index) {
        return tableCore.getColumnName(index);
    }

    @Override
    public String getName() {
        return tableCore.getName();
    }

    @Override
    public void setName(String name) {
        tableCore.setName(name);
    }
}
