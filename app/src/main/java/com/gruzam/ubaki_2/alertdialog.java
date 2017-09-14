package com.gruzam.ubaki_2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 황인태 on 2017-09-14.
 */

public class alertdialog extends AppCompatActivity {

    int x = 0;
    int answer = 0;

    int show_quiz;

    String[] Question;
    String[][] Quiz;
    String[] Correct;

    String[] parant_teaching = {
            "문제 1) 다음 중 알맞지 않는 것을 고르시오.",
            "문제 2) 3 ~ 4세 정도가 되면 서너 개의 단어를 사용해서 문장을 형성하고, 단어도 1000개 정도에 이른다.",
            "문제 3) 유아기(2~6세)는 영아기(0 ~ 2세) 만큼 급격한 신체발달이 일어나는 시기이기 때문에 편식을 하지 않도록 주의를 기울어야 한다."
    };

    String[] disease = {
            "문제 4) 다음 중 옳지 않은 치료방법은?",
            "문제 5) 기저귀 발진은 기저귀를 차고있는 엉덩이에만 발생하는 피부병이다.",
            "문제 6) 다음 중 올바른 치료 방법이 아닌 것은?"
    }

    String[] child_safety = {
            "문제 7) 심장 마사지 시 직접 흉부 압박을 실시하는 두 손가락을 고르시오.",
            "문제 8) 청색증은 피부와 점막이 푸른색을 나타내는 것을 말한다.",
            "문제 9) 얼굴이 창백해 지는 현상은 머리를 부딪히거나 깜짝 놀랐을 때 발생한다.",
            "문제 10) 다음 중 간질이 발생할 가능성이 없는 것은?",
            "문제 11) 열성 경련은 몇 분간 밖에 지속하지 않아 보통의 약물투여가 필요 없다.",
            "문제 12) 식도에 이물을 제거하기 위해 설사약을 먹인다."
    };

    String[][] parant_teaching_quiz = {
            {"출생 초기에 보이는 변을 태변이라 하는데 끈적끈적하고 냄새가 없으며\n"+"암록색이나 검은색을 띠고 있다.",
                    "대략 사흘 정도가 지나면 변의 색이 노란색으로 변한다.",
                    "인공유는 모유보다 면역체가 부족하여 좀 더 묽은 변을 하루에 1 ~ 2회 배설한다.",
                    "모유는 묽은 변을 하루에 2 ~ 4회 배설한다."},
            {"O", "X"},
            {"O", "X"}
    };

    String[][] disease_quiz = {
            {"서늘한 환경을 마들어 준다.",
                    "목욕은 30 ~ 40분으로 길게 하는 것이 좋다.",
                    "피부를 촉촉하게 해준다.",
                    "화학 약품이 들어있지 않은 로션과 크림 등을 사용한다."},
            {"O", "X"},
            {"민간요법으로 소금물을 사용하여 아이의 피부에 발라준다.",
                    "염증이 심할 경우엔 칼라민 로션을 사용한다.",
                    "가능한 클렌징 제품 사용 자제한다.",
                    "냉찜질 & 오이마사지를 해준다."}
    };

    String[][] child_safety_quiz = {
            {"검지, 중지",
                    "중지, 약지",
                    "약지, 새끼",
                    "새끼, 검지"},
            {"O", "X"},
            {"O", "X"},
            {"발작 전에 신경학적 혹은 발육 이상이 있었던 아이",
                    "15분 이상 계속되거나, 하루에 1회 이상 일어났을 때",
                    "1세 이하에서 경련이 시작되었을 때",
                    "최고의 열 상승기에 경련을 일으켰을 때"},
            {"O", "X"},
            {"O", "X"}
    };

    String[] parant_teaching_correct = {
            "인공유는 모유보다 면역체가 부족하여 좀 더 묽은 변을 하루에 1 ~ 2회 배설한다.",
            "O",
            "X"
    };

    String[] disease_correct = {
            "목욕은 30 ~ 40분으로 길게 하는 것이 좋다.",
            "X",
            "민간요법으로 소금물을 사용하여 아이의 피부에 발라준다."
    };

    String[] child_safety_correct = {
            "중지, 약지",
            "O",
            "O",
            "최고의 열 상승기에 경련을 일으켰을 때",
            "O",
            "X"
    };

    String[] Explanation_array = {"이부분에 해설"};

    public AlertDialog.Builder QuestionManual;
    public AlertDialog.Builder Explanation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);/*상태바 없애기*/
        setContentView(R.layout.activity_main);

        QuestionManual = new AlertDialog.Builder(this, R.style.AlertDialogTheme); //styles.xml 테마 적용 부분 적용
        Explanation = new AlertDialog.Builder(this);

        Button radiobutton = (Button) findViewById(R.id.set_button);

        radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeQuiz();
            }
        });

        switch (show_quiz) {
            case 1:
                Question = parant_teaching;
                Quiz = parant_teaching_quiz;
                Correct = parant_teaching_correct;
            case 2:
                Question = disease;
                Quiz = disease_quiz;
                Correct = disease_correct;
            case 3:
                Question = child_safety;
                Quiz = child_safety_quiz;
                Correct = child_safety_correct;
        }

    }
    public class DialogButtonClickHandler implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialog, int clicked) {

            if (true)
                check();
        }
    }
    public void makeQuiz() {
        TextView title =  new TextView(this);
        title.setText(Question[x]);
        title.setTextSize(22);

        QuestionManual.setSingleChoiceItems(Quiz[x], -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                answer = item;
            }
        }).setCustomTitle(title).setPositiveButton("확인", new DialogButtonClickHandler());

        QuestionManual.create().show();
    }

    public void check() {      // 문제 정답 확인
        CharSequence retValue = "";
        if (Quiz[x][answer].equals(Correct[x])) {
            retValue = "정답입니다!";
            x++; // 다음 문제로 넘어감
            if (x == Quiz.length) { // 다음 동영상 재생시 이 부분을 바꾸면 된다.
                Button chang_button = (Button) findViewById(R.id.set_button);
                chang_button.setText("NEXT");
                x = 0;
            }else {
                Toast.makeText(getApplicationContext(), retValue, Toast.LENGTH_LONG).show();
                makeQuiz();
            }

            Explanation.setMessage(Explanation_array[0]);
            Explanation.create().show();

        } else {
            retValue = "틀렸습니다. 다시한번 확인하세요.";
            Toast.makeText(getApplicationContext(), retValue, Toast.LENGTH_LONG).show();
        }
    }

    public void initQuestion(int init){
        this.show_quiz = init;
    }
}

