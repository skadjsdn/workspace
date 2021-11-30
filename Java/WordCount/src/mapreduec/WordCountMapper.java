package mapreduec;

import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//map 연사을 수행하는 컴포넌트
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text,IntWritable>.Context) {
		StringTokenizer token = new StringTokenizer(value.toString());
		while(token.hasMoreElements()	) {
			String word = token.nextToken();
			
			Text txt = new Text(word);
			context.write(txt, new IntWritable(1))
		}
		
	}
}
