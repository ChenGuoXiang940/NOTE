onerror {quit -f}
vlib work
vlog -work work RELATIONAL.vo
vlog -work work RELATIONAL.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.RELATIONAL_vlg_vec_tst
vcd file -direction RELATIONAL.msim.vcd
vcd add -internal RELATIONAL_vlg_vec_tst/*
vcd add -internal RELATIONAL_vlg_vec_tst/i1/*
add wave /*
run -all
