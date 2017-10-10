package com.gruzam.ubaki_2;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 황인태 on 2017-09-14.
 */

public class alertdialog {

    int x = 0;
    int answer = 0;

    int show_quiz;

    String[] Question = null;
    String[][] Quiz = null;
    String[] Correct = null;
    String[] Explanation_arr = null;

    String[] parant_teaching = {
            "문제 1) 다음 중 알맞지 않는 것을 고르시오.",
            "문제 2) 3 ~ 4세 정도가 되면 서너 개의 단어를 사용해서 문장을 형성하고, 단어도 1000개 정도에 이른다.",
            "문제 3) 유아기(2~6세)는 영아기(0 ~ 2세) 만큼 급격한 신체발달이 일어나는 시기이기 때문에 편식을 하지 않도록 주의를 기울어야 한다."
    };

    String[] disease = {
            "문제 4) 다음 중 옳지 않은 치료방법은?",
            "문제 5) 기저귀 발진은 기저귀를 차고있는 엉덩이에만 발생하는 피부병이다.",
            "문제 6) 다음 중 올바른 치료 방법이 아닌 것은?"
    };

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

    String[] Explanation_arr_parant_teaching = {
            "묽은 변이 아닌 좀 더 단단한 변을 배설한다.",
            "3 ~ 4세 정도가 되면 서너 개의 단어를 사용해서 문장을 형성하고, 단어도 1000개 정도에 이른다.",
            "유아기 같은 급격한 신체발달이 일어나지 않는다."
    };

    String[] Explanation_arr_disease = {
            "목욕은 너무 장시간 뜨거운 물에 노출시키지 말고 10~15분 내외로 짧게 마치는 것이 좋다. 또한 목욕을 자주 시켜주면 피부를 악화 시킬 수 있으니 특별한 이 없으면 일주일에 3,4회 정도 시켜주는 것이 좋다.",
            "젖은 기저귀에 직접 닿는 하복부, 생식기 주변과 허벅지 윗부분이 빨갛게 변하거나 작은 반점이 생기는 것도 기저귀 발진을 의심해 볼 수 있다.",
            "민간요법으로 소금물을 사용 시 가려움을 더 유발할 수 있다."
    };

    String[] Explanation_arr_child_safety = {
            "두 젖꼭지 사이의 가상선 아래 흉골에 세 손가락을 두고 검지는 들어 올리고 두 손가락(중지와 약지)으로 흉골의 하부 1/3 부위를 압박한다.",
            "청색증은 피부와 점막이 푸른색을 나타내는 것이므로 주로 분노 발작의 요소로서 또는 야단치거나 다른 속상한 경우에 대응하여 유아에서 잠재의식적으로 시작된다.",
            "일반적으로 떨어져 머리를 부딪히거나 갑자기 깜짝 놀라는 등의 통증을 경험한 후 나타난다.",
            "영유아에서 열성감염증이 있을 때 최고의 열 상승기에 전신 경련을 일으키는 경우이며, 모든 소아의 3 ~ 4%에서 경험한다고 한다. 하지만 간질이 될 가능성은 낮다.",
            "의복을 벗겨 가슴을 열어 압박하지 않도록 한다.\n" + "머리는 차게 한다.\n" + "머리를 좀 높게한다.",
            "말도안되는 방법이다 절대해선 안된다."
    };

    public AlertDialog.Builder QuestionManual;
    public AlertDialog.Builder Explanation;
    public Context mcontext;


    protected void alertdialog() {
        QuestionManual = new AlertDialog.Builder(mcontext, R.style.AlertDialogTheme); //styles.xml 테마 적용 부분 적용
        Explanation = new AlertDialog.Builder(mcontext);

        //makeQuiz();

        switch (show_quiz) {
            case 0:
                Question = parant_teaching;
                Quiz = parant_teaching_quiz;
                Correct = parant_teaching_correct;
                Explanation_arr = Explanation_arr_parant_teaching;
                break;
            case 1:
                Question = disease;
                Quiz = disease_quiz;
                Correct = disease_correct;
                Explanation_arr = Explanation_arr_disease;
                break;
            case 2:
                Question = child_safety;
                Quiz = child_safety_quiz;
                Correct = child_safety_correct;
                Explanation_arr = Explanation_arr_child_safety;
                break;
        }

    }
    public class DialogButtonClickHandler implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialog, int clicked) {

            if (true)
                check();
        }
    }
    public void makeQuiz() {
        TextView title =  new TextView(mcontext);
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
            if (x == Quiz.length) {

            }else {
                Toast.makeText(mcontext, retValue, Toast.LENGTH_LONG).show();
                makeQuiz();
            }

            Explanation.setMessage(Explanation_arr[x - 1]);
            Explanation.setPositiveButton("확인", null);
            Explanation.create().show();

        } else {
            retValue = "틀렸습니다. 다시한번 확인하세요.";
            Toast.makeText(mcontext, retValue, Toast.LENGTH_LONG).show();
        }
    }

    public void initQuestion(int init, Context mcontext){
        this.show_quiz = init;
        this.mcontext = mcontext;
    }
}

