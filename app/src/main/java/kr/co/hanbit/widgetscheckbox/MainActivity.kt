package kr.co.hanbit.widgetscheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import kr.co.hanbit.widgetscheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    /* listener 프로퍼티 만든 후 be lazy를 사용해서 CompoundButton 클래스에 있는 OnCheckedChangeListener를 직접 작성 */
    val listener by lazy {
        CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            when (buttonView.id) {
                R.id.checkApple ->
                    when (isChecked) {
                        true -> Log.d("CheckBox", "사과가 선택되었습니다.")
                        false -> Log.d("CheckBox", "사과가 선택 해제되었습니다.")
                    }
                R.id.checkBanana ->
                    when (isChecked) {
                        true -> Log.d("CheckBox", "바나나가 선택되었습니다.")
                        false -> Log.d("CheckBox", "바나나가 선택 해제되었습니다.")
                    }
                R.id.checkOrange ->
                    when (isChecked) {
                        true -> Log.d("CheckBox", "오렌지가 선택되었습니다.")
                        false -> Log.d("CheckBox", "오렌지가 선택 해제되었습니다.")
                    }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.checkApple.setOnCheckedChangeListener (listener)
        binding.checkBanana.setOnCheckedChangeListener (listener)
        binding.checkOrange.setOnCheckedChangeListener (listener)
    }
}