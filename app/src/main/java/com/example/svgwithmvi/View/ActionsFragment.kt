package com.example.svgwithmvi.View


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.svgwithmvi.intents.InitialEventsIntent
import com.example.svgwithmvi.viewmodel.MainViewModel
import com.example.svgwithmvi.R
import com.example.svgwithmvi.View.Adapter.ActionsAdapter
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.fragment_actions.view.*

/**
 * A simple [Fragment] subclass.
 */
class ActionsFragment : Fragment() {

    private val actionPublisher:PublishSubject<InitialEventsIntent> = PublishSubject.create()


    private lateinit var disposable:Disposable
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProviders.of(activity!!).get(MainViewModel::class.java)
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_actions, container, false)

        disposable = actionPublisher.subscribe(viewModel.mainIntentsPublisher::onNext)
        view.actionFragmentRecyclerView.layoutManager =  LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        view.actionFragmentRecyclerView.adapter =
            ActionsAdapter(viewModel.actionsFragmentDataList.getList()) { position ->
                when (viewModel.getActionId(position)) {
                    R.drawable.action_group_24dp -> actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.Group
                    )
                    R.drawable.action_ungroup_24dp -> actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.UnGroup
                    )
                    R.drawable.action_attach24dp -> actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.Attach
                    )
                    R.drawable.action_deattach24dp -> actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.DeAttach
                    )
                    R.drawable.action_duplicate_24dp ->{}/* actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.Duplicate
                    )*/
                    R.drawable.action_zoom_in_24dp ->
                    actionPublisher.onNext(
                                InitialEventsIntent.TouchEvents.Pinch.UpdateHeight(
                                    1.4f,
                                    true
                                )
                            )
                    R.drawable.action_zoom_out_24dp -> actionPublisher.onNext(
                        InitialEventsIntent.TouchEvents.Pinch.UpdateHeight(
                            .8f,
                            true
                        )
                    )
                    R.drawable.action_delete_24dp -> actionPublisher.onNext(
                        InitialEventsIntent.ActionSelect.Delete
                    )
                }
            }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        disposable.dispose()
    }

   /* class ActionsAdapter(val actionList:List<RecyclerViewImageAndTextDataListHolder.RecyclerViewData>,val onActionClickListener:(Int) -> Unit):RecyclerView.Adapter<ActionsAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflater:LayoutInflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.actions_fragment_custom_recyclearview,parent,false)
            return ViewHolder(
                view,
                onActionClickListener
            )
        }

        override fun getItemCount(): Int {
            return actionList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.image.setImageResource(actionList[position].imageId)
            holder.text.text = actionList[position].imageText
        }

        class ViewHolder(itemView: View,val onActionClickListener:(Int) -> Unit) : RecyclerView.ViewHolder(itemView),View.OnClickListener {


            var image:ImageView = itemView.actionFragmentCustomRecyclerViewImageView
            val text:TextView = itemView.actionFragmentCustomRecyclerViewTextView
            init {
                itemView.setOnClickListener(this)
            }
            override fun onClick(v: View?) {
                onActionClickListener(adapterPosition)
            }
        }
    }*/

}
