package dev.mars;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        var columnNames = new LinkedHashMap<String,String>();
        columnNames.put("Name", "string");
        columnNames.put("Age", "int");
        columnNames.put("Occupation", "string");

        table.setColumns(columnNames);

        Map<String, String> row1 = new HashMap<>();
        row1.put("Name", "Alice");
        row1.put("Age", "30");
        row1.put("Occupation", "Engineer");

        Map<String, String> row2 = new HashMap<>();
        row2.put("Name", "Bob");
        row2.put("Age", "25");
        row2.put("Occupation", "Designer");

        table.addRow(row1);
        table.addRow(row2);

        table.printTable();

        System.out.println("Value at (0, 'Age'): " + table.getValueAt(0, "Age"));
        table.setValueAt(0, "Age", "31");
        System.out.println("Updated Value at (0, 'Age'): " + table.getValueAt(0, "Age"));

        table.printTable();

        // Write the table data to a CSV file
        CSVUtils.writeToCSV(table, "output.csv", false);

        Table table2 = new Table();

        // Read the table data from a CSV file
        CSVUtils.readFromCSV(table2, "output.csv", false, false);

        // Print the table to verify the content
        table2.printTable();
    }
}