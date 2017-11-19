package com.example.triviality;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "ComputerSciQuiz";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer";
	private static final String KEY_OPTA= "opta";
	private static final String KEY_OPTB= "optb";
	private static final String KEY_OPTC= "optc";
	private static final String KEY_OPTD= "optd";
	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT, "+KEY_OPTD+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		//db.close();
	}
	private void addQuestions()
	{
		Question q1=new Question("What is the result of the following statements?\n" +
				"            int n = - - 3 - -1;\n" +
				"            System.out.println(n);\n","1", "2", "3","4", "4");
		addQuestion(q1);
		Question q2=new Question("What is the value of i after the following code is executed?\n" +
				"   int i = 0, n = 100;\n" +
				"   for (i++; i < n; n--)\n" +
				"i++;","49", "50", "51","99", "51");
		addQuestion(q2);
		Question q3=new Question("What" +
				"is the output from\n" +
				"   String s = \"La\";\n" +
				"   s.toUpperCase();\n" +
				"   System.out.println(s + s.toLowerCase());","Lala", "LAla", "LaLa","laLA", "Lala");
		addQuestion(q3);
		Question q4=new Question("What is the result when\n" +
				"            System.out.println((int)Double.parseDouble(\".9\"));\n" +
				"is compiled/executed?","Syntax error", "ClassCastException", "NumberFormatException","0", "0");
		addQuestion(q4);
		Question q5=new Question("What values are stored in the array nums after the following code is executed?\n" +
				"            int[] nums = {3, 0, 4, 2, 1};\n" +
				"            int len = nums.length;\n" +
				"            for (int i = 0; i < len; i++)\n" +
				"              for (int count = 1; count <= len; count++)\n" +
				"                nums[i] = nums[nums[i]];","0,0,0,0,0", "0,1,2,3,4", "0,0,4,2,0","0,4,2,1,3", "0,0,0,0,0");
		addQuestion(q5);
		Question q6=new Question(
				"What values are stored in the array arr after the following code is executed?\n" +
				"        int[] arr = {1, 2, 3, 4, 5};\n" +
				"        int s = 0;\n" +
				"        for (int a : arr)\n" +
				"        {\n" +
				"s += a;\n" +
				"a = s; }","0,0,0,0,0", "1,2,3,4,5", "0,1,3,6,10","1,3,6,10,15", "1,2,3,4,5");
		addQuestion(q6);
		Question q7=new Question("An array of size 15 holds four 1s and eleven 0s. All 1s are grouped together in one contiguous block. How many comparisons are needed in the worst case to find the exact placement of the block of 1s?","4", "5", "6","11", "4");
		addQuestion(q7);
		Question q8=new Question("Suppose the method isSuch is defined as follows:\n" +
				"          public static boolean isSuch(int n)\n" +
				"          {\n" +
				"            return n > 2 && !isSuch(n - 2);\n" +
				"}\n" +
				"What is the output from\n" +
				"            System.out.println(isSuch(99) + \" \" + isSuch(100));","false false", "false true", "true false","true true", "true true");
		addQuestion(q8);
		Question q9=new Question("What is the output from the following code:\n" +
				"            LinkedList<String> lst = new LinkedList<String>();\n" +
				"            lst.add(\"X\");\n" +
				"            lst.add(\"Y\");\n" +
				"            lst.add(\"Z\");\n" +
				"            Iterator<String> it = lst.iterator();\n" +
				"            while(it.hasNext())\n" +
				"              it.remove();\n" +
				"            System.out.println(lst);","[]", "[X]", "[X, Z]","Illegal State Exception", "Illegal State Exception");
		addQuestion(q9);
		Question q10=new Question("If a heap has 2099 nodes, how many of them are leaves?","51", "1023", "1024","1050", "1050");
		addQuestion(q10);
		Question q11=new Question("Consider the following interface and class:\n" +
				"        public interface Readable\n" +
				"        {\n" +
				"          void read();\n" +
				"}\n" +
				"        public abstract class Code implements Readable\n" +
				"{\n" +
				"public Code(String txt) { < code not shown > } public abstract void read();\n" +
				"public void save() { < code not shown > }\n" +
				"}\n" +
				"Which of the following statements will compile and execute without errors?","Readablec=newReadable();", "Code c = new Code();", "Readable c = new Code(\"***\");","Codec=newReadable(\"***\");", "Codec=newReadable(\"***\");");
		addQuestion(q11);
		Question q12=new Question("Which one of them produces a value different from the other four for some values of x?","x%100/10", "x/10%10", "(x- x%100)/10","x/10-x/100*10", "(x- x%100)/10");
		addQuestion(q12);
		Question q13=new Question("Which of the following statements is equivalent to\n" +
				"            if (a == 0 || b*b - 4*a*c <= 0)\n" +
				"              return false;\n" +
				"            else\n" +
				"              return true;","returna==0||b*b-4*a*c<=0;", "returna==0&&b*b-4*a*c>0;", "returna!=0||b*b-4*a*c>0;","returna!=0&&b*b-4*a*c>0;", "returna==0||b*b-4*a*c<=0;");
		addQuestion(q13);
		Question q14=new Question("What is the output from the following code segment?\n" +
				"            String s = \"xoxoxo\";\n" +
				"            System.out.println(s.substring(\n" +
				"               s.indexOf(s.substring(2)), s.indexOf(s.substring(3))));","x", "o", "xo","oxoxo", "oxoxo");
		addQuestion(q14);
		Question q15=new Question("Consider the following code segment:\n" +
				"            int[] counts = new int[3];\n" +
				"            for (int i = 1; i <= 3; i++)\n" +
				"              counts[(int)(3 * Math.random())] += (int)(3 * Math.random());\n" +
				"            System.out.println(Arrays.toString(counts));\n" +
				"Which of the following outputs can never occur?","[0,0,0]", "[0, 1, 0]", "[0, 1, 2]","[1,1,1]", "[0, 1, 2]");
		addQuestion(q15);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION()); 
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		values.put(KEY_OPTD, quest.getOPTD());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		dbase = this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		while(quesList.size()!=30){
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quest.setOPTD(cursor.getString(6));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
	}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
