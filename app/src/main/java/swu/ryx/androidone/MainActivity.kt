package swu.ryx.androidone

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Activity用来管理界面的生命周期
         * 具体的界面需要自己配置 res -> layout
         * 通过setContentView关联xml文件
         */
        setContentView(R.layout.activity_main)
        //监听按钮被点击的事件
        //mLoginbutton.setOnClickListener(this)
//        mLoginbutton.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                println("22")
//            }

      //  })
//        mLoginbutton.setOnClickListener({view: View? ->
////            println("333")
////        })
//        mLoginbutton.setOnClickListener { view: View? ->
//            println("444")
//        }
        mLoginbutton.setOnClickListener {
            //添加旋转 动画 平移 缩放
//apply also with run
           /* ObjectAnimator.ofFloat(mheader,"rotation",0f,360f).also {
                it.duration = 300
                it.repeatCount = 5
            it.start()
//            //监听动画的结束事件
            it.addListener(object : Animator.AnimatorListener{
                override fun onAnimationRepeat(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
                    //界面跳转
                    startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                }

                override fun onAnimationCancel(animation: Animator?) {

                }

                override fun onAnimationStart(animation: Animator?) {
                }
           })*/


            ObjectAnimator.ofFloat(mheader,"rotation",0f,360f).apply {
                duration = 500
                repeatCount = 6
                start()
                addListener(object : MyAnimatorListner(){
                    override fun onAnimationEnd(animation: Animator?) {
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }
                })
            }


//           val anim =  ObjectAnimator.ofFloat(mheader,"rotation",0f,360f)
//            anim.duration = 500
//            anim.repeatCount = 5
//            anim.start()
//            //监听动画的结束事件
//            anim.addListener(object : Animator.AnimatorListener{
//                override fun onAnimationRepeat(animation: Animator?) {
//
//                }
//
//                override fun onAnimationEnd(animation: Animator?) {
//                    //界面跳转
//                    startActivity(Intent(this@MainActivity,DetailActivity::class.java))
//                }
//
//                override fun onAnimationCancel(animation: Animator?) {
//
//                }
//
//                override fun onAnimationStart(animation: Animator?) {
//
//                }
//            })
//            startActivity(Intent(this,DetailActivity::class.java))
        }
    }

    override fun onClick(v: View?) {
//        添加旋转动画
//跳转
        //startActivity(Intent(this,DetailActivity::class.java))
    }
}
