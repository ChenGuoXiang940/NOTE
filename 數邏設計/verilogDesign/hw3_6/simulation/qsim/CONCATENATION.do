onerror {quit -f}
vlib work
vlog -work work CONCATENATION.vo
vlog -work work CONCATENATION.vt
vsim -novopt -c -t 1ps -L arriaii_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.CONCATENATION_vlg_vec_tst
vcd file -direction CONCATENATION.msim.vcd
vcd add -internal CONCATENATION_vlg_vec_tst/*
vcd add -internal CONCATENATION_vlg_vec_tst/i1/*
add wave /*
run -all
