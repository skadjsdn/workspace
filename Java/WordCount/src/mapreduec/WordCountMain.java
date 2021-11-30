package mapreduec;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

/*
 * 날짜 : 2021/09/15
 * 이름 : 남언우
 * 내용 : 하둡 MapReduce 프로그래밍 실습
 * 
 */


public class WordCountMain {

	
	public static void main(String[] args) throws Exception {
		Configurable conf = new Configured();
		Job job = new Job(conf,"WordCount");
		
		job.setJarByClass(WordCountMain.class);
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.waitForCompletion(true);
		
		System.out.println("WordCount 끝");
		
		
	}
}
