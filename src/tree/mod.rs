use std::cell::RefCell;
use std::rc::Rc;

use crate::TreeNode;

pub type OptNode = Option<Rc<RefCell<TreeNode>>>;

mod binary_tree_level_order_traversal;
mod binary_tree_preorder_traversal;
mod longest_path_with_different_adjacent_characters;
mod minimum_time_to_collect_all_apples_in_a_tree;
mod number_of_good_paths;
mod number_of_nodes_in_the_sub_tree_with_the_same_label;
mod same_tree;
mod symmetric_tree;
